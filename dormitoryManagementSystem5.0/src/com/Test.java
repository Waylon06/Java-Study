package com;

import com.dao.AdminDao;


import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("1是辅导员账号\n2是宿管账号\n3是监管者账号\n4以后都是辅导员助理账号");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入管理员账号");
        int aid = scanner.nextInt();
        System.out.println("请输入管理员密码");
        String password = scanner.next();
        try {
            AdminDao ad = new AdminDao();
            boolean login = new AdminDao().login(aid, password);
            if (login){
                System.out.println("登录成功");
                ad.judgePower(aid);
            }else {
                System.out.println("登陆失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


}
