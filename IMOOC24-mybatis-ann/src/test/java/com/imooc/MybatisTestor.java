package com.imooc;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.imooc.mybatis.entity.Goods;
import com.imooc.mybatis.entity.GoodsDetail;
import com.imooc.mybatis.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.*;

public class MybatisTestor {
    @Test
    public void testSqlSessionFactor() throws IOException {
//     // 利用Reader加载  classpath下的mybatis-config。xml核心 配置文件
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);//通过reader解析xml返回对应sqlsessionfactory对象
        System.out.println(sqlSessionFactory);
        // 创建SqlSession对象，SqlSessio是 JDBC的扩展类 ，用于与数据库交互
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            //创建数据库连接 测试用
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (sqlSession != null) {
                //如果type="POOLED",代表使用连接池,close则是将连接回收到连接池中
                //如果type="UNPOOLED",代表直连,close则会调用Connection.close()方法关闭连接
                sqlSession.close();
            }
        }
    }

    @Test
    public void testMyBatisUtils() {
        SqlSession sqlSession = null;
        Connection connection = null;
        try {
            sqlSession = MybatisUtils.openSession();
            connection = sqlSession.getConnection();
            System.out.println(connection);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void SelectAll() {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            List<Goods> goodsList = session.selectList("goods.selectAll");
            for (Goods item : goodsList) {
                System.out.println(item.getTitle());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void SelectById() {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            Goods goods = session.selectOne("goods.selectById", 1602);
            System.out.println("goods:" + goods.getTitle());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void testSelectByPriceRange() throws Exception {
        SqlSession session = null;
        Map params = new HashMap();
        params.put("min", 100);
        params.put("max", 500);
        params.put("limit", 10);
        try {
            session = MybatisUtils.openSession();
            List<Goods> list = session.selectList("goods.selectByPriceRange", params);
            for (Goods g : list) {
                System.out.println(g.getTitle() + ":" + g.getCurrentPrice());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void selectGoodsType() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            List<Map> list = session.selectList("goods.selectGoodsMap");
            for (Map map : list) {
                System.out.println(map);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void InsertGoods() {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            Goods goods = new Goods();
            goods.setTitle("测试商品");
            goods.setSubTitle("测试商品副标题");
            goods.setOriginalCost(100f);
            goods.setCurrentPrice(80f);
            goods.setDiscount(1f);
            goods.setIsFreeDelivery(1);
            // 返回值为本次插入成功的条数
            Integer num = session.insert("goods.insert", goods);
            session.commit();//提交事务数据
            System.out.println(goods.getGoodsId());
        } catch (Exception e) {
            if (session != null) {
                session.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void testUpdate() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            Goods goods = session.selectOne("goods.selectById", 739);
            goods.setTitle("跟新测试商品");
            int num = session.update("goods.update", goods);
            session.commit();
        } catch (Exception e) {
            if (session != null) {
                session.rollback();
            }
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }

//        session.selectOne("goods.update",1602);
    }

    @Test
    public void testDelete() throws Exception {
        SqlSession session = null;
        int num = 0;
        try {
            session = MybatisUtils.openSession();
            Goods goods = new Goods();
            goods = session.selectOne("goods.selectById", 739);
            System.out.println(goods.getTitle());
            num = session.delete("goods.delete", goods);
            session.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
        System.out.println(num);
    }

    @Test
    public void selectByTitle() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            String title = "爱恩幼 孕妇护肤品润养颜睡眠面膜 100g";
            Map params = new HashMap();
            params.put("title", "'【日本】日本Moony XL38(女)拉拉裤*4包'");
            Goods goods = session.selectOne("goods.selectByTitle", params);
            List<Goods> list = session.selectList("goods.selectByTitle", params);
//            System.out.println(goods.getTitle());
            for (Goods item : list) {
                System.out.println(item.getTitle() + ":" + item.getCurrentPrice());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void testDynamicSQL() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("categoryId", 44);
//            params.put("currentPrice",49);
            List<Goods> list = session.selectList("goods.dynamicSQL", params);
            for (Goods item : list) {
                System.out.println(item.getTitle() + ":" + item.getCurrentPrice());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    /**
     * 测试一级缓存
     */
    @Test
    public void testLv1Cache() throws Exception {
//        一级缓存的生存周期就是在一个sqlSession中 下面一个sqlsession的hashcode和上面的完全不同
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            Goods goods = session.selectOne("goods.selectById", 1603);
            Goods goods1 = session.selectOne("goods.selectById", 1603);
            System.out.println(goods.hashCode() + ":" + goods1.hashCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }

        try {
            session = MybatisUtils.openSession();
            Goods goods = session.selectOne("goods.selectById", 1603);
            session.commit(); // commit会强制清空已有的缓存，导致 goods和goods1的hashcode不一样
            Goods goods1 = session.selectOne("goods.selectById", 1603);
            System.out.println(goods.hashCode() + ":" + goods1.hashCode());//980138431:888655833
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }

    }

    /**
     * 二级缓存测试
     */
    @Test
    public void testLv2Cache() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            Goods goods = session.selectOne("goods.selectById", 1603);
            System.out.println(goods.hashCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }

        try {
            session = MybatisUtils.openSession();
            Goods goods = session.selectOne("goods.selectById", 1603);
            System.out.println(goods.hashCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    /**
     * 测试一对多
     */
    @Test
    public void testOneToMany() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
//            Goods goods = new Goods();
//            goods.setGoodsDetails(session.<GoodsDetail>selectList("goods.onToMany"));
            List<Goods> list = session.selectList("goods.onToMany");
            for (Goods good : list) {
                System.out.println(good.getTitle() + ":" + good.getGoodsDetails().size());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }

    }

    /**
     * 测试多对一对象关联映射
     */
    @Test
    public void testManytoOne() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
            List<GoodsDetail> list = session.selectList("goodsDetail.manyToOne");
            for (GoodsDetail gd : list) {
                System.out.println(gd.getGdPicUrl() + ":" + gd.getGoods().getTitle());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void onToMany() throws Exception {
        SqlSession session = null;
        try {
            session = MybatisUtils.openSession();
//            自动将下一次查询进行分页
            PageHelper.startPage(2, 10);
            Page<Goods> page = (Page) session.selectList("goods.selectPage");
            System.out.println("总页数：" + page.getPages());
            System.out.println("总记录数：" + page.getTotal());
            System.out.println("开始  行号：" + page.getStartRow());
            System.out.println("结束行号 " + page.getPageNum());
            System.out.println("当前页码 " + page.getPageNum());
            List<Goods> data = page.getResult();
            for (Goods g : data) {
                System.out.println(g.getTitle());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }

    @Test
    public void testBatchInsert() throws Exception {
        SqlSession session = null;
        try {
            long at = new Date().getTime();
            session = MybatisUtils.openSession();
            List list = new ArrayList();
            for (int i = 0; i < 10000; i++) {
                Goods goods = new Goods();
                goods.setTitle("测试商品");
                goods.setSubTitle("测试子标题");
                goods.setOriginalCost(200f);
                goods.setCurrentPrice(100f);
                goods.setDiscount(0.5f);
                goods.setIsFreeDelivery(1);
                goods.setCategoryId(43);
                list.add(goods);
            }
//                insert() 方法返回值代表本次成功插入的记录总数
            session.insert("goods.batchInsert", list);
            session.commit();//提交事务数据
            long et = new Date().getTime();
            System.out.println("执行时间:" + (et - at) + "毫秒");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }
    }
    @Test
    public void testBatchDelete() throws Exception{
        SqlSession  session  =  null;
        try {
            long at = new Date().getTime();
            session = MybatisUtils.openSession();
            List list  = new ArrayList();
            list.add(1920);
            list.add(1921);
            list.add(1922);
            session.delete("goods.batchDelete",list);
            session.commit();
            long ed  = new  Date().getTime();
            System.out.println("执行时间:" + (ed - at) + "毫秒");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MybatisUtils.closeSession(session);
        }

    }

}
