package com.utils;

import java.sql.*;

public class MysqlConnect {

    private static String url = "jdbc:mysql://localhost:3306/dms?UseUnicode=true&characterEncoding=utf-8";
    private static String username = "root";
    private static String password = "123456";

    public static Connection getConn() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(url, username, password);
    }




}
