package com.pojo;

import com.dao.AdminDao;
import com.dao.UserDao;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
    private int aid;
    private String aname;
    private String apassword;
    private int power;
    private String classes;

    @Override
    public String toString() {
        return "Admin{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apssword='" + apassword + '\'' +
                ", power=" + power +
                ", classes='" + classes + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApssword() {
        return apassword;
    }

    public void setApssword(String apassword) {
        this.apassword = apassword;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public Admin() {
    }

    public Admin(int aid, String aname, String apassword, int power, String classes) {
        this.aid = aid;
        this.aname = aname;
        this.apassword = apassword;
        this.power = power;
        this.classes = classes;
    }

    public void dormitoryAdmin() throws SQLException {
        UserDao user = new UserDao();
        System.out.println("您好！宿管阿姨，请选择您所需要的服务：");
        System.out.println("1.查询寝室入住信息\n2.删除学生床位信息\n3.新增学生入住信息\n4.查询学生未归信息");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1 :user.information();
            break;
            case 2 :user.del();
            break;
            case 3 :user.insert();
            default: System.out.println("您的输入有误");
        }
    }
}
