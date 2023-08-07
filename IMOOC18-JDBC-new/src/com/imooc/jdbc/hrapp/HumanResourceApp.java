package com.imooc.jdbc.hrapp;

import com.imooc.jdbc.hrapp.command.*;

import java.util.Scanner;

public class HumanResourceApp {
    public static void main(String[] args) {
        System.out.println("1、查询部门员工");
        System.out.println("2、新增员工");
        System.out.println("3、调整薪资");
        System.out.println("4、删除员工");
        System.out.println("5、分页查询员工数");
        System.out.println("输入0退出");
        Scanner sc = new Scanner(System.in);
        Integer cmd = -1;
        Command command = null;
        while(cmd != 0){
            cmd = sc.nextInt();
            switch (cmd){
                case 1://查询员工部门
                    command = new QueryCommand();
                    command.excute();
                    break;
                case 2:
                    command = new InsertCommand();
                    command.excute();
                    break;
                case 3:
                    command = new UpdateCommand();
                    command.excute();
                    break;
                case 4:
                    command = new DeleteCommand();
                    command.excute();
                    break;
                case 5:
                    command = new PaginationCommand();
                    command.excute();
                    break;
            }
        }
    }
}
