package com.waylon.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;


import java.sql.Connection;

import java.sql.SQLException;

import javax.sql.DataSource;


public class C3P0UItil {
    private static ComboPooledDataSource ds = new ComboPooledDataSource();

    //获取数据源
    public static DataSource getDataSource() {
        return ds;
    }

    //获取一个连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();


    }
}