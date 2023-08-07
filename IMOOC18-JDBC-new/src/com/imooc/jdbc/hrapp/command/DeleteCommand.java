package com.imooc.jdbc.hrapp.command;

import com.imooc.jdbc.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteCommand implements Command{

    @Override
    public void excute() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        try {
            conn = DbUtils.getConnection();
            System.out.println("请输入员工编号：");
            Integer eno = sc.nextInt();
            String sql = "Delete From employee where eno =?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,eno);
            int num = pstmt.executeUpdate();
            if(num != 0){
                System.out.println("离职手续已完成！");
            }else {
                System.out.println("未找到" + eno + "编号员工数据");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            DbUtils.closeConnection(rs,pstmt,conn);
        }
    }
}
