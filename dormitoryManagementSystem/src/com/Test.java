package com;

import com.utils.Interface;
import com.utils.MysqlConnect;

import java.sql.*;

public class Test extends Interface {
    private static Connection conn;
    private static Statement stmt;
    private static PreparedStatement insert, del, change, find;
    private static ResultSet rs;
    public static void main(String[] args) {
        Interface login = new Interface();
        login.regulator();
//        try {
//            conn = MysqlConnect.getConn();
//            stmt = conn.createStatement();
//
//            String sql = "select * from stuinformation";
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
//
//
    }
}
