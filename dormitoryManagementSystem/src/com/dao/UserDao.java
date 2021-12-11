package com.dao;

import com.utils.MysqlConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDao {

    private Connection conn = null;
    private PreparedStatement prep = null, del, insert1, insert2, back;
    private ResultSet rs = null;

    public void information() throws SQLException {

        String sql1 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位'  from student, building where student.sid = building.sid group by student.sid ";
        conn = MysqlConnect.getConn();
        prep = conn.prepareStatement(sql1);
        ResultSet rs = prep.executeQuery();
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
        System.out.println("以下是今天未归寝室的学生信息");
        String sql5 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位'  from student, building where student.sid = building.sid and back = 0 group by student.sid ";
        conn = MysqlConnect.getConn();
        back = conn.prepareStatement(sql5);
        ResultSet rs = back.executeQuery();
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


    /**
     * 录入学生就寝信息（缺勤/正常）
     * @param sid 学生学号
     * @param back 归寝状态 1归寝，0未归
     * @return true执行成功，false执行失败
     */
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


}
