package com.dao;

import com.utils.Panel;
import com.utils.MysqlConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDao {

    private Connection conn = null;
    private PreparedStatement prep = null, del, insert1, insert2, back, myClass, isLive,  noback, addAssistant, change, change1,xuehao;
    private ResultSet rs = null;

    public void information() throws SQLException {
        int c =2;
        Panel bc = new Panel();
        bc.regulator(c);
//        String sql1 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位'  from student, building where student.sid = building.sid group by student.sid ";
//        conn = MysqlConnect.getConn();
//        prep = conn.prepareStatement(sql1);
//        ResultSet rs = prep.executeQuery();
//        System.out.println("学号"+"\t"+"姓名"+"\t"+"班级"+"\t\t"+"寝室楼"+"\t"+"楼层"+"\t"+"寝室号"+"\t"+"床位");
//        /** 必须重置游标到第一行之前 */
//        rs.beforeFirst();
//        while (rs.next()){
//            System.out.print(rs.getInt(1)+"\t\t");
//            System.out.print(rs.getString(2)+"\t");
//            System.out.print(rs.getString(3)+"\t");
//            System.out.print(rs.getString(4)+"\t");
//            System.out.print(rs.getInt(5)+"\t\t");
//            System.out.print(rs.getInt(6)+"\t\t");
//            System.out.println(rs.getInt(7)+"\t");
//        }
    }

    public void del() throws SQLException {
        System.out.println("请输入需删除床位信息学生的学号：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sql2 = "delete from building where sid= "+a;
        conn = MysqlConnect.getConn();
        del = conn.prepareStatement(sql2);
        int i = del.executeUpdate();
        if (i==0){
            System.out.println("删除失败");
        }
        else{
            System.out.println("删除成功");
        }


    }

    public void insert() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需增加学生的学号：");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入需增加学生的姓名：");
        String sname = sc.nextLine();
        System.out.println("请输入需增加学生的班级：");
        String classes = sc.nextLine();
        System.out.println("请输入需增加学生的寝室楼：");
        String building = sc.nextLine();
        System.out.println("请输入需增加学生的楼层：");
        int floor = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入需增加学生的寝室号：");
        int house = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入需增加学生的床位：");
        int bed = sc.nextInt();
        String sql3 = "insert into student(sid, sname, classes, spower)   VALUES('"+sid+"','"+sname+"','"+classes+"',0);";
        String sql4 = "insert into building(building, floor, house, bed, sid, live)  VALUES('"+building+"','"+floor+"','"+house+"','"+bed+"','"+sid+"', 0);";
        conn = MysqlConnect.getConn();
        insert1 = conn.prepareStatement(sql3);
        insert2 = conn.prepareStatement(sql4);
        int i = insert1.executeUpdate();
        int j = insert2.executeUpdate();
        if (j == 0&&i == 0){
            System.out.println("增加失败");
        }
        else{
            System.out.println("增加成功");
        }
    }

    public void back() throws SQLException {
        int c =1;
        Panel bc = new Panel();
        bc.regulator(c);
//        System.out.println("以下是今天未归寝室的学生信息");
//        String sql5 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位' from student, building where student.sid = building.sid and back = 0 group by student.sid ";
//        conn = MysqlConnect.getConn();
//        back = conn.prepareStatement(sql5);
//        rs = back.executeQuery();
//        System.out.println("学号"+"\t"+"姓名"+"\t"+"班级"+"\t\t"+"寝室楼"+"\t"+"楼层"+"\t"+"寝室号"+"\t"+"床位");
//        while (rs.next()){
//            System.out.print(rs.getInt(1)+"\t\t");
//            System.out.print(rs.getString(2)+"\t");
//            System.out.print(rs.getString(3)+"\t");
//            System.out.print(rs.getString(4)+"\t");
//            System.out.print(rs.getInt(5)+"\t\t");
//            System.out.print(rs.getInt(6)+"\t\t");
//            System.out.println(rs.getInt(7)+"\t");
//        }
    }

    public void myClass() throws SQLException {
        System.out.println("请输入您所管理的班级：");
        Scanner sc = new Scanner(System.in);
        String classes = sc.nextLine();
        String sql6 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位' from student, building where student.sid = building.sid and classes = ? group by student.sid";
        conn = MysqlConnect.getConn();
        myClass = conn.prepareStatement(sql6);
        myClass.setString(1,classes);
        rs = myClass.executeQuery();
        if (rs.next()){
            System.out.println("以下是您所管理班级的寝室学生信息：");
            System.out.println("学号"+"\t"+"姓名"+"\t"+"班级"+"\t\t"+"寝室楼"+"\t"+"楼层"+"\t"+"寝室号"+"\t"+"床位");
            rs.beforeFirst();
            while (rs.next()){
                System.out.print(rs.getInt(1)+"\t\t");
                System.out.print(rs.getString(2)+"\t");
                System.out.print(rs.getString(3)+"\t");
                System.out.print(rs.getString(4)+"\t");
                System.out.print(rs.getInt(5)+"\t\t");
                System.out.print(rs.getInt(6)+"\t\t");
                System.out.println(rs.getInt(7)+"\t");
            }
        }else {
            System.out.println("抱歉，未查找到您的班级");
        }

    }


    public void isLive() throws SQLException {
        System.out.println("请输入所需要查询的寝室号：");
        Scanner sc = new Scanner(System.in);
        int house = sc.nextInt();
        String sql7 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位' from student, building where student.sid = building.sid and building.house = ? group by student.sid";
        conn = MysqlConnect.getConn();
        isLive = conn.prepareStatement(sql7);
        isLive.setInt(1, house);
        rs = isLive.executeQuery();
        if (rs.next()) {
            System.out.println("以下是您查询的寝室信息：");
            System.out.println("学号" + "\t" + "姓名" + "\t" + "班级" + "\t\t" + "寝室楼" + "\t" + "楼层" + "\t" + "寝室号" + "\t" + "床位");
            int i = 1;
            rs.beforeFirst();
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getString(4) + "\t");
                System.out.print(rs.getInt(5) + "\t\t");
                System.out.print(rs.getInt(6) + "\t\t");
                System.out.println(rs.getInt(7) + "\t");
                i++;
            }
            if (i < 6){
                System.out.println("该寝室还能入住");
            }else if(i >= 6){
                System.out.println("该寝室已经挤爆了");
            }
        } else {
            System.out.println("抱歉，未找到该生信息");
        }
    }

    public void noBack() throws SQLException {
        System.out.println("请输入您所管理的班级：");
        Scanner sc = new Scanner(System.in);
        String classes = sc.nextLine();
        System.out.println("以下是夜不归寝人员名单：");
        String sql9 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位' from student, building where student.sid = building.sid and back = 0 and classes = ?";
        conn =  MysqlConnect.getConn();
        noback = conn.prepareStatement(sql9);
        noback.setString(1,classes);
        rs = noback.executeQuery();
        System.out.println("学号"+"\t"+"姓名"+"\t"+"班级"+"\t\t"+"寝室楼"+"\t"+"楼层"+"\t"+"寝室号"+"\t"+"床位");
        while (rs.next()){
            System.out.print(rs.getInt(1)+"\t\t");
            System.out.print(rs.getString(2)+"\t");
            System.out.print(rs.getString(3)+"\t");
            System.out.print(rs.getString(4)+"\t");
            System.out.print(rs.getInt(5)+"\t\t");
            System.out.print(rs.getInt(6)+"\t\t");
            System.out.println(rs.getInt(7)+"\t");
        }
    }

    public void addAccident() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需增加助理的工号：");
        int aid = sc.nextInt();
        sc.nextLine();
        System.out.println("请输入需增加助理的姓名：");
        String aname = sc.nextLine();
        System.out.println("请设置需增加助理的密码：");
        String apassword = sc.nextLine();
        System.out.println("请输入需增加助理的班级：");
        String classes = sc.nextLine();
        String sql10 = "insert into admin(aid, aname, apassword, classes, power)   VALUES('"+aid+"','"+aname+"','"+apassword+"','"+classes+"',4);";
        conn = MysqlConnect.getConn();
        addAssistant = conn.prepareStatement(sql10);
        int i = addAssistant.executeUpdate();
        if (i == 0){
            System.out.println("增加失败");
        }
        else{
            System.out.println("增加成功");
        }
    }

    public void change() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.以学号检索修改信息\n2.以姓名检索修改信息");
        int i =sc.nextInt();
        if(i == 1){
            System.out.println("请输需修改信息的学号");
            int sid = sc.nextInt();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入修改的姓名：");
            String sname = scanner.nextLine();
            System.out.println("请输入修改的班级：");
            String classes = scanner.nextLine();
            System.out.println("请输入修改的寝室楼：");
            String building = scanner.nextLine();
            System.out.println("请输入修改的楼层：");
            int floor = scanner.nextInt();
            scanner.nextLine();
            System.out.println("请输入修改的寝室号：");
            int house = scanner.nextInt();
            scanner.nextLine();
            System.out.println("请输入修改的床位：");
            int bed = scanner.nextInt();
            String sql = "update student, building set sname = ? , classes = ?, building = ?,floor = ?, house = ?, bed = ? where student.sid = building.sid and student.sid = ?";
            conn = MysqlConnect.getConn();
            change = conn.prepareStatement(sql);
            change.setString(1,sname);
            change.setString(2,classes);
            change.setString(3,building);
            change.setInt(4,floor);
            change.setInt(5,house);
            change.setInt(6,bed);
            change.setInt(7,sid);
            int j = change.executeUpdate();
            if (j == 0){
                System.out.println("修改失败");
            }else{
                System.out.println("修改成功");
            }
        }else if (i == 2){
            System.out.println("请输需修改信息的姓名");
            String sname = sc.next();
            sc.nextLine();
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入修改的学号：");
            int sid = scanner.nextInt();
            System.out.println("请输入修改的班级：");
            String classes = scanner.next();
            scanner.nextLine();
            System.out.println("请输入修改的寝室楼：");
            String building = scanner.next();
            System.out.println("请输入修改的楼层：");
            int floor = scanner.nextInt();
            scanner.nextLine();
            System.out.println("请输入修改的寝室号：");
            int house = scanner.nextInt();
            scanner.nextLine();
            System.out.println("请输入修改的床位：");
            int bed = scanner.nextInt();
            String sql2 = "update student, building set student.sid = ? , classes = ?, building = ?,floor = ?, house = ?, bed = ?, building.sid = ? where student.sid = building.sid and sname = ?";
            conn = MysqlConnect.getConn();
            change1 = conn.prepareStatement(sql2);
            System.out.println(sname);
            change1.setInt(1,sid);
            change1.setString(2,classes);
            change1.setString(3,building);
            change1.setInt(4,floor);
            change1.setInt(5,house);
            change1.setInt(6,bed);
            change1.setInt(7,sid);
            change1.setString(8,sname);
            int n = change1.executeUpdate();
            if (n == 0){
                System.out.println("修改失败");
            }else{
                System.out.println("修改成功");
            }
        }else {
            System.out.println("没有此选项，你的输入有误！");
        }

    }



    public boolean isback(int sid,int back) throws SQLException {
        String sql = "update student set back = ? where sid = ?";
        conn = MysqlConnect.getConn();
        prep = conn.prepareStatement(sql);
        prep.setInt(1,back);
        prep.setInt(2,sid);
        int i = prep.executeUpdate();
        if (i>0){
            return true;
        }
        return false;
    }
    public void xuehao() throws SQLException {
        System.out.println("请输入所需要需录入学生学号：");
        Scanner scn = new Scanner(System.in);
        String classes = scn.nextLine();
        int sid = scn.nextInt();
        System.out.println("录入其是否就寝：\n0.未就寝\n1.已就寝");
        int back = scn.nextInt();
        boolean isback = false;
        if (isback) {
            System.out.println("录入成功");
        } else {
            System.out.println("录入失败");
        }
    }



}
