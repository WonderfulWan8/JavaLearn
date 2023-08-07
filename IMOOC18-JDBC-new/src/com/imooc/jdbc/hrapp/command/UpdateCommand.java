package com.imooc.jdbc.hrapp.command;

import com.imooc.jdbc.common.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateCommand implements Command {
    @Override
    public void excute() {
        Connection conn = null;
        Scanner sc = new Scanner(System.in);
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {

            conn = DbUtils.getConnection();
            String sql = "UPDATE employee set salary =? where eno = ?";
            System.out.println("请输入员工编号：");
            String eno = sc.next();
            System.out.println("请输入调薪额度：");
            Float salary = sc.nextFloat();
            pstmt = conn.prepareStatement(sql);
            pstmt.setFloat(1, salary);
            pstmt.setString(2, eno);
            int res = pstmt.executeUpdate();
            if (res != 0) {
                System.out.println("调薪成功");
            } else {
                System.out.println("未找到" + eno + "编号员工数据");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DbUtils.closeConnection(rs, pstmt, conn);
        }

    }
}
