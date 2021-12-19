package com.pojo;

import com.dao.UserDao;

import java.sql.SQLException;
import java.util.Scanner;

public class Admin {
    private int aid;
    private String aname;
    private String apassword;
    private int power;
    private String classes;

    public Admin() {
    }

    public Admin(int aid, String aname, String apassword, int power, String classes) {
        this.aid = aid;
        this.aname = aname;
        this.apassword = apassword;
        this.power = power;
        this.classes = classes;
    }

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

    public void dormitoryAdmin() throws SQLException {
        UserDao user = new UserDao();
        System.out.println("您好！宿管阿姨，请选择您所需要的服务：");
        System.out.println("1.查询寝室入住信息\n2.删除学生床位信息\n3.新增学生入住信息\n4.查询学生未归信息\n5.退出");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                user.information();
                break;
            case 2:
                user.del();
                break;
            case 3:
                user.insert();
                break;

            case 4:
                user.back();
                break;
            case 5:
                break;
            default:
                System.out.println("抱歉，没有此选项");
        }
    }

    public void teacher() throws SQLException {
        UserDao user = new UserDao();
        System.out.println("您好！辅导员，请选择您所需要的服务：");
        System.out.println("1.查询自己负责班级学生信息\n2.录入学生当天就寝情况\n3.导出自身负责班级夜不归寝的学生名单\n4.添加学生助理\n5.修改学生信息（增加的功能）\n6.退出");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        switch (b) {
            case 1:
                user.myClass();
                break;
            case 2:
                System.out.println("请输入所需要需录入学生学号：");
                Scanner scn = new Scanner(System.in);
                int sid = scn.nextInt();
                System.out.println("录入其是否就寝：\n0.未就寝\n1.已就寝");
                int back = scn.nextInt();
                boolean isback = new UserDao().isback(sid, back);
                if (isback) {
                    System.out.println("录入成功");
                } else {
                    System.out.println("录入失败");
                }
                break;
            case 3:
                user.noBack();
                break;
            case 4:
                user.addAccident();
                break;
            case 5:
                user.change();
            case 6:
                break;
            default:
                System.out.println("抱歉，没有此选项");
        }
    }

    public void assistant() throws SQLException {
        UserDao user = new UserDao();
        System.out.println("您好！辅导员助理，请选择您所需要的服务：");
        System.out.println("1.录入学生就寝信息\n2.退出");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("请输入所需要需录入学生学号：");
                Scanner scn = new Scanner(System.in);
                int sid = scn.nextInt();
                System.out.println("录入其是否就寝：\n0.未就寝\n1.已就寝");
                int back = scn.nextInt();
                boolean isback = new UserDao().isback(sid, back);
                if (isback) {
                    System.out.println("录入成功");
                } else {
                    System.out.println("录入失败");
                }
                break;
            case 2:
                break;
            default:
                System.out.println("抱歉，没有此选项");
        }
    }

    public void root() throws SQLException {
        UserDao user = new UserDao();
        System.out.println("您好！监管者，请选择您所需要的服务：");
        System.out.println("1.查询寝室入住信息\n2.删除学生床位信息\n3.新增学生入住信息\n4.查询学生未归信息\n5.查询自己负责班级学生信息\n6.录入学生当天就寝情况\n7.导出自身负责班级夜不归寝的学生名单\n8.添加学生助理\n9.管理寝室\n10.退出");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        switch (d) {
            case 1:
                user.information();
                break;
            case 2:
                user.del();
                break;
            case 3:
                user.insert();
                break;
            case 4:
                user.back();
                break;
            case 5:
                user.myClass();
                break;
            case 6:
                System.out.println("请输入所需要需录入学生学号：");
                Scanner scn = new Scanner(System.in);
                int sid = scn.nextInt();
                System.out.println("录入其是否就寝：\n0.未就寝\n1.已就寝");
                int back = scn.nextInt();
                boolean isback = new UserDao().isback(sid, back);
                if (isback) {
                    System.out.println("录入成功");
                } else {
                    System.out.println("录入失败");
                }
                break;
            case 7:
                user.noBack();
                break;
            case 8:
                user.addAccident();
                break;
            case 9:
                user.isLive();
            case 10:
                break;
            default:
                System.out.println("抱歉，没有此选项");
        }
    }

}
