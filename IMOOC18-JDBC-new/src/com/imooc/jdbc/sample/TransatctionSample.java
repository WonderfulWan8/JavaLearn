package com.imooc.jdbc.sample;

import com.imooc.jdbc.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC中的事务控制
 */
public class TransatctionSample {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = DbUtils.getConnection();
//            JDBC默认使用自动提交模式
            conn.setAutoCommit(false);//关闭自动提交
            String sql = "insert into employee(eno,ename,salary,dname) values(?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            for (int i = 1000; i < 2000; i++) {
//                if (i == 1005) {
//                    throw new RuntimeException("插入失败");
//                }
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, i);
                pstmt.setString(2, "员工" + i);
                pstmt.setFloat(3, 4000f);
                pstmt.setString(4, "市场部");
                pstmt.executeUpdate();
            }
            conn.commit();//手动提交数据
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
}
