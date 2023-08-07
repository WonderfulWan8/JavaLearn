package com.imooc.jdbc.hrapp.command;

import com.imooc.jdbc.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertCommand implements Command {

    @Override
    public void excute() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        System.out.println("请输入员工编号");
        Scanner sc = new Scanner(System.in);
        Integer eno = sc.nextInt();
        System.out.println("请输入员工姓名");
        String ename = sc.next();
        System.out.println("请输入员工薪资");
        float salary = sc.nextFloat();
        System.out.println("请输入员工部门");
        String dname = sc.next();
        System.out.println("请输入员工入职日期");
        String strHiredate = sc.next();
        //        1.String转为java.util.date
        java.util.Date udHiredate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            udHiredate =  sdf.parse(strHiredate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //        2.java.util.date转为java.sql.Date
        long time = udHiredate.getTime();//获取1970年到现在的毫秒数
        java.sql.Date sdHiredate = new java.sql.Date(time);
        try {
            conn = DbUtils.getConnection();
            String sql = "INSERT INTO employee(eno,ename,salary,dname,hiredate) VALUES(?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,eno);
            pstmt.setString(2,ename);
            pstmt.setFloat(3,salary);
            pstmt.setString(4,dname);
            pstmt.setDate(5,sdHiredate);//java.sql.Date
//            ex
            int rowsAffected = pstmt.executeUpdate();
            if(rowsAffected !=0){
                System.out.println("执行成功");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
//            关闭资源
            DbUtils.closeConnection(rs,pstmt,conn);
        }





    }
}
