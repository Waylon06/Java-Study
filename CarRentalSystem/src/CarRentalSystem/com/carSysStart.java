package CarRentalSystem.com;

import java.sql.*;
import java.util.Scanner;

public class carSysStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������˺�");
        String id = scanner.nextLine();
        System.out.println("����������");
        String pwd = scanner.nextLine();
        try {
            mysqlConnect mysql = new mysqlConnect();
            boolean login = new mysqlConnect().login(id,pwd);
            if (login){
                System.out.println("��¼�ɹ�");
                if (id.equals("user")){
                    System.out.println("�û���¼�ɹ�");
                    userConsole p=new userConsole();
                    p.setP(100);
                    p.getP().initBaseinfo();
                    p.getInfo();
                }else if (id.equals("root")){
                    System.out.println("����Ա��¼�ɹ�");
                    rootConsole p=new rootConsole();
                    p.setP(100);
                    p.getP().initBaseinfo();
                    p.getInfo();
                }
            }else {
                System.out.println("����������˺Ŵ���");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

