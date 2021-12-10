package com.dao;

import com.Test;
import com.pojo.Admin;
import com.utils.MysqlConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminDao {
    private Connection conn = null;
    private PreparedStatement prep = null;


    /**
     * 管理员登录
     * @param aid 管理员编号
     * @param password 管理员密码
     * @return 是否成功
     * @throws SQLException
     */

    public boolean login(int aid, String password) throws SQLException {
        String sql = "select * from admin where aid = ? and apassword = ?";
        conn = MysqlConnect.getConn();
        prep = conn.prepareStatement(sql);
        prep.setInt(1,aid);
        prep.setString(2,password);
        ResultSet resultSet = prep.executeQuery();
        if (resultSet.next()){
            return true;
        }else {
            return false;
        }
    }
    public void judgePower() throws SQLException {
        Admin ad = new Admin();
        System.out.println("请再次输入您的管理员账号：");
        Scanner sc = new Scanner(System.in);
        int aid = sc.nextInt();
        String sql = "select power from admin where aid = "+aid;
        conn = MysqlConnect.getConn();
        prep = conn.prepareStatement(sql);
        ResultSet rs = prep.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1));
        }
        if (aid == 1){
            ad.dormitoryAdmin();
        }
        if (aid == 2){

        }
    }

}
