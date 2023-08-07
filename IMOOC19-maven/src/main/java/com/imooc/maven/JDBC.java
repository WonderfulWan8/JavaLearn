package com.imooc.maven;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai", "root", "aA867198");
            pstmt =  conn.prepareStatement("select   * from employee ");
            rs = pstmt.executeQuery();
            while (rs.next()){
                Integer eno = rs.getInt("eno");
                String ename = rs.getString("ename");
                float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                Date hiredate = rs.getDate("hiredate");
                System.out.println(eno + "-" + ename + "-" + salary + "-" + dname + "-" + hiredate);
            }
        }catch (Exception   e){
            e.printStackTrace();
        }finally {
            try {
                if(conn!=null&&conn.isClosed()==false){
                    conn.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
