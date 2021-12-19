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

    public void judgePower(int aid) throws SQLException {
        Admin ad = new Admin();
        String sql = "select power from admin where aid = "+aid;
        conn = MysqlConnect.getConn();
        prep = conn.prepareStatement(sql);
        ResultSet rs = prep.executeQuery();
        int i = 0;
        if (aid == 1){
            while (i == 0){
                ad.teacher();
                System.out.println("输入0返回、输入其他数字退出：");
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
            }
        }
        else if (aid == 2){
            while(i == 0){
                ad.dormitoryAdmin();
                System.out.println("输入0返回、输入其他数字退出：");
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
            }
        }
        else if (aid == 3){
            while (i == 0) {
                ad.root();
                System.out.println("输入0返回、输入其他数字退出：");
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
            }
        }
        else if (aid >= 4){
            while (i == 0) {
                ad.assistant();
                System.out.println("输入0返回、输入其他数字退出：");
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();
            }
        }
    }

}
