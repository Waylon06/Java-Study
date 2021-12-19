package CarRentalSystem.com;

import java.sql.*;
import java.util.Scanner;

public class carSysStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号");
        String id = scanner.nextLine();
        System.out.println("请输入密码");
        String pwd = scanner.nextLine();
        try {
            mysqlConnect mysql = new mysqlConnect();
            boolean login = new mysqlConnect().login(id,pwd);
            if (login){
                System.out.println("登录成功");
                if (id.equals("user")){
                    System.out.println("用户登录成功");
                    userConsole p=new userConsole();
                    p.setP(100);
                    p.getP().initBaseinfo();
                    p.getInfo();
                }else if (id.equals("root")){
                    System.out.println("管理员登录成功");
                    rootConsole p=new rootConsole();
                    p.setP(100);
                    p.getP().initBaseinfo();
                    p.getInfo();
                }
            }else {
                System.out.println("您的密码或账号错误");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

