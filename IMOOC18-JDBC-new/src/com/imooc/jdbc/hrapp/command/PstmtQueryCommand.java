package com.imooc.jdbc.hrapp.command;

import java.sql.*;
import java.util.Scanner;

public class PstmtQueryCommand implements Command {
    @Override
    public void excute() {
        System.out.println("请输入部门名称：");
        Scanner sc = new Scanner(System.in);
        String pdname = sc.next();
        Connection conn = null;
//        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //        1.加载并注册JDBC驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //        2.创建数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "aA867198");
            //        3.创建 PreparedStatement 对象 用于执行sql文件
//            stmt = conn.createStatement();
            String sql = "select  * from employee where dname = ? and eno > ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,pdname);
            pstmt.setInt(2,3500);
//            rs = stmt.executeQuery("select  * from employee where dname = ?");
            rs = pstmt.executeQuery();
            //        4.遍历查询结果
            while (rs.next()) {
                Integer eno = rs.getInt("eno");
                String ename = rs.getString("ename");
                float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                Date hiredate = rs.getDate("hiredate");
                System.out.println(eno + "-" + ename + "-" + salary + "-" + dname + "-" + hiredate);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //        5.关闭链接，释放资源
            try {
                if (rs != null) {

                    rs.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (conn != null && conn.isClosed() == false) {
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
