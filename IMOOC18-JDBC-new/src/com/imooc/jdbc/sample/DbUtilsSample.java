package com.imooc.jdbc.sample;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.imooc.jdbc.common.DbUtils;
import com.imooc.jdbc.hrapp.entity.Employee;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class DbUtilsSample {
    private static void query() {
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            QueryRunner qr = new QueryRunner(dataSource);
            System.out.println("请输入页数");
            Scanner sc = new Scanner(System.in);
            int page = sc.nextInt();
            Object[] params = new Object[]{page};
//            将结果自动的转化为对应的实体类 query查询完后会自动关闭 不需要手动关闭
            List<Employee> list = qr.query("select * from employee limit ?,10", new BeanListHandler<>(Employee.class), params);
            for (Employee emp : list) {
                System.out.println(emp.getEname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static  void update(){
        Properties properties = new Properties();
        String propertyFile = DbUtilsSample.class.getResource("/druid-config.properties").getPath();
        Connection conn = null;
        try {
            propertyFile = new URLDecoder().decode(propertyFile, "UTF-8");
            properties.load(new FileInputStream(propertyFile));
            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
            conn = dataSource.getConnection();
            conn.setAutoCommit(false);
            String sql1 = "update employee set salary=salary+1000 where eno=?";
            String sql2 = "update employee set salary=salary-500 where eno=?";
            QueryRunner qr = new QueryRunner(dataSource);

//            System.out.println("请输入员工编号");
//            Scanner sc = new Scanner(System.in);
//            int eno = sc.nextInt();
//            Object[] params = new Object[]{eno};

            qr.update(conn,sql1,new Object[]{1000});
            qr.update(conn,sql2,new Object[]{1001});
            conn.commit();


        }catch (Exception e){
            e.printStackTrace();
            try {
                if(conn!=null && !conn.isClosed()){
                    conn.rollback();
                }
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }finally {
            try {
                if(conn!=null && !conn.isClosed()){
                    conn.rollback();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
//        query();
        update();
    }
}
