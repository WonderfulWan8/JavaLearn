package com.imooc.jdbc.sample;

import com.imooc.jdbc.common.DbUtils;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * JDBC中批处理
 */
public class BatchSample {

//    标准方式插入若干数据
    public static void tc1(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            long startTime = new Date().getTime();
//            获取当前时间


            conn = DbUtils.getConnection();
//            JDBC默认使用自动提交模式
            conn.setAutoCommit(false);//关闭自动提交
            String sql = "insert into employee(eno,ename,salary,dname) values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            for (int i = 100000; i < 200000; i++) {
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, i);
                pstmt.setString(2, "员工" + i);
                pstmt.setFloat(3, 4000f);
                pstmt.setString(4, "市场部");
                pstmt.executeUpdate();
            }
            conn.commit();//手动提交数据
            long endTime = new Date().getTime();
            System.out.println("tc1执行总时长："+( endTime - startTime));

        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn != null && !conn.isClosed()){
                    conn.rollback();//回滚
                }
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        } finally {
            DbUtils.closeConnection(null, pstmt, conn);
        }
    }
    //    使用批处理插入若干数据
    public static void tc2(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            long startTime = new Date().getTime();
//            获取当前时间
            conn = DbUtils.getConnection();
//            JDBC默认使用自动提交模式
            conn.setAutoCommit(false);//关闭自动提交
            String sql = "insert into employee(eno,ename,salary,dname) values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            for (int i = 200000; i < 300000; i++) {
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, i);
                pstmt.setString(2, "员工" + i);
                pstmt.setFloat(3, 4000f);
                pstmt.setString(4, "市场部");
                pstmt.addBatch();//将参数加入批处理任务
//                pstmt.executeUpdate();
            }
            pstmt.executeBatch();//执行批处理任务
            conn.commit();//手动提交数据
            long endTime = new Date().getTime();
            System.out.println("tc2执行总时长："+( endTime - startTime));

        } catch (Exception e) {
            e.printStackTrace();
            try {
                if(conn != null && !conn.isClosed()){
                    conn.rollback();//回滚
                }
            } catch (SQLException ex) {
                e.printStackTrace();
            }
        } finally {
            DbUtils.closeConnection(null, pstmt, conn);
        }
    }

    public static void main(String[] args) {
        tc1();
        tc2();
    }
}
