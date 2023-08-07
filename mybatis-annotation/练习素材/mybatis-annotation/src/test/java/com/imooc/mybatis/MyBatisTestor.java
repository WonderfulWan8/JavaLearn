package com.imooc.mybatis;

import com.imooc.mybatis.dao.GoodsDAO;
import com.imooc.mybatis.entity.Goods;
import com.imooc.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

//JUNIT单元测试类
public class MyBatisTestor {

    @Test
    public void testByPriceRange() {
        SqlSession session = null;
        try {
            session = MyBatisUtils.openSession();
            GoodsDAO goodsDAO = session.getMapper(GoodsDAO.class);
           List<Goods>  list= goodsDAO.selectByPriceRange(100,500,20);
           for(Goods item:list){
               System.out.println(item.getTitle()+":"+item.getCurrentPrice());
           }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyBatisUtils.closeSession(session);
        }
    }

    @Test
    public void testInsert() throws Exception{
        SqlSession  session =   null;
        try {
            session =  MyBatisUtils.openSession();
            Goods  goods = new Goods();
            goods.setTitle("测试   商品");
            goods.setSubTitle("ces");
            goods.setOriginalCost(100f);
            goods.setCurrentPrice(200f);
            goods.setDiscount(0.5f);
            goods.setIsFreeDelivery(1);
            goods.setCategoryId(41);
            GoodsDAO goodsDAO  = session.getMapper(GoodsDAO.class);
            int  num = goodsDAO.insert(goods);
            System.out.println(num);
            session.commit();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            MyBatisUtils.closeSession(session);
        }
    }

    @Test
    public void testSelectAll() throws Exception {
        SqlSession session = null;
        try {
            session = MyBatisUtils.openSession();
            GoodsDAO goodsDAO = session.getMapper(GoodsDAO.class);
            List list = goodsDAO.selectAll();
            System.out.println(
<<<<<<< HEAD
                    "test1"
=======
                    "test"
>>>>>>> 8c75cf214895d32c8f934290c603d6539a94118d
            );
            System.out.println(list.size());
        } catch (Exception e) {
            throw e;
        } finally {
            MyBatisUtils.closeSession(session);
        }
    }
//
//    @Test
//    public void testSelectByPriceRange() throws Exception {
//        SqlSession session = null;
//        try {
//            session = MyBatisUtils.openSession();
//            GoodsDAO goodsDAO = session.getMapper(GoodsDAO.class);
//            List list = goodsDAO.selectByPriceRange(100f,500f,20);
//            System.out.println(list.size());
//        } catch (Exception e) {
//            throw e;
//        } finally {
//            MyBatisUtils.closeSession(session);
//        }
//    }
//
//
//    /**
//     * 新增数据
//     * @throws Exception
//     */
//    @Test
//    public void testInsert() throws Exception {
//        SqlSession session = null;
//        try{
//            session = MyBatisUtils.openSession();
//            Goods goods = new Goods();
//            goods.setTitle("测试商品");
//            goods.setSubTitle("测试子标题");
//            goods.setOriginalCost(200f);
//            goods.setCurrentPrice(100f);
//            goods.setDiscount(0.5f);
//            goods.setIsFreeDelivery(1);
//            goods.setCategoryId(43);
//            GoodsDAO goodsDAO = session.getMapper(GoodsDAO.class);
//            //insert()方法返回值代表本次成功插入的记录总数
//            int num = goodsDAO.insert(goods);
//            session.commit();//提交事务数据
//            System.out.println(goods.getGoodsId());
//        }catch (Exception e){
//            if(session != null){
//                session.rollback();//回滚事务
//            }
//            throw e;
//        }finally {
//            MyBatisUtils.closeSession(session);
//        }
//    }

}
