package com.imooc.jdbc.sample;

import java.sql.*;


public class StandardSample {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            System.out.println("Standard.main");
//        1.加载并注册JDBC驱动
            Class.forName("com.mysql.jdbc.Driver");
//        2.创建数据库连接
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/imooc?useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai",
                    "root", "aA867198"
            );
//        3.创建Statement对象 用于执行sql文件
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from employee");
//        4.遍历查询结果
            while (rs.next()){
                Integer eno = rs.getInt(1);//把当前行指定位置的数据提取
                String ename = rs.getString("ename");
                float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                System.out.println("dname:"+"-"+eno+""+"  "+ename+"-"+salary);
            }

        } catch (Exception e){
            e.printStackTrace();
        }finally {
//        5.关闭链接，释放资源
            try {
                if (conn != null && conn.isClosed() == false) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
