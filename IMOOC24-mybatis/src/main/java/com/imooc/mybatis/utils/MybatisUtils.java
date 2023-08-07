package com.imooc.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MybatisUtils {
    // 利用static静态类不属于对象，且全局唯一
    private static SqlSessionFactory sqlSessionFactory = null;
//    利用静态块在初始化类  时实例化sqlSessionFactory
    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
//            初始化 错误时 ，通过抛出异常Exception通知调用者
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * openSession对象 创建一个新的 SqlSession对象
     * @return
     */
    public static SqlSession  openSession(){
        return sqlSessionFactory.openSession();
    }

    /**
     * 释放一个有效的SqlSession对象
     * @param session 准备释放SqlSession对象
     */
    public static void closeSession(SqlSession  session){
        if (session!=null){
            session.close();
        }
    }
}
