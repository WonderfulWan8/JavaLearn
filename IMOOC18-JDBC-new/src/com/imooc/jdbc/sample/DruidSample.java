package com.imooc.jdbc.sample;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.imooc.jdbc.common.DbUtils;
import com.imooc.jdbc.hrapp.entity.Employee;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class DruidSample {
    public static void main(String[] args) {
//    1.加载属性文件
        Properties properties = new Properties();
        String propertyFile = DruidSample.class.getResource("/druid-config.properties").getPath();//获取当前类路径下对应文件的路径
        //空格->%20 | c:\java code\druid-config.properties
        //c:\java%20code\druid-config.properties
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");//解决中文路径问题 空格->20%
            properties.load(new FileInputStream(propertyFile));
        } catch (Exception e) {
            e.printStackTrace();
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Employee> employee = new ArrayList<Employee>();
        try {
            //    2.获取DataSource数据源 数据源就是数据库在JDBC中的名称
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            //    3.创建数据库链接
            conn = dataSource.getConnection();
            pstmt = conn.prepareStatement("select * from employee limit 0,10");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Integer eno = rs.getInt("eno");
                String  ename = rs.getString("ename");
                Float salary = rs.getFloat("salary");
                String dname = rs.getString("dname");
                Date hiredate = rs.getDate("hiredate");
//                Employee emp = new Employee();
//                emp.setEno(eno);
//                emp.setEname(ename);
//                emp.setSalary(salary);
//                emp.setDname(dname);
//                emp.setHiredate(hiredate);
//                employee.add(emp);
                System.out.println(eno + "-" + ename + "-" + salary + "-" + dname + "-" + hiredate);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            /**
             * 不使用连接池:conn.close()关闭连接
             * 使用连接池:conn.close()将连接收回至连接池
             */
            DbUtils.closeConnection(rs,pstmt,conn);
        }

    }
}
