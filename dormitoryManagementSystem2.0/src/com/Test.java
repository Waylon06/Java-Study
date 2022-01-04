package com;

import com.dao.AdminDao;
import com.dao.UserDao;
import com.pojo.Admin;
import com.pojo.Student;
import com.utils.AllUser;
import com.utils.Interface;
import com.utils.MysqlConnect;

import java.sql.*;
import java.util.Scanner;

public class Test extends Interface {
    private static Connection conn;
    private static Statement stmt;
    private static PreparedStatement insert, del, change, find;
    private static ResultSet rs;
    public static void main(String[] args) {
//        new AllUser().setVisible(true);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入管理员账号");
//        int aid = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("请输入管理员密码");
//        String password = scanner.nextLine();
//        try {
//            AdminDao ad = new AdminDao();
//            boolean login = new AdminDao().login(aid, password);
//            if (login){
//                System.out.println("登录成功");
//                ad.judgePower(aid);
//            }else {
//                System.out.println("登陆失败");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }







        Interface login = new Interface();
        login.regulator();
//        try {
//            conn = MysqlConnect.getConn();
//            stmt = conn.createStatement();
//
//            String sql = "select * from student";
//            rs = stmt.executeQuery(sql);
//
//        if (null!= MysqlConnect.getConn()){
//            System.out.println("连接数据库成功");
//        }else {
//            System.out.println("连接数据库失败");
//        }
//            while (rs.next()){
//                System.out.print(rs.getInt(1)+"\t");
//                System.out.print(rs.getString(2)+"\t");
//                System.out.print(rs.getString(3)+"\t");
//                System.out.print(rs.getInt(4)+"\t");
//                System.out.print(rs.getInt(5)+"\t");
//                System.out.println(rs.getString(6));
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }


}
