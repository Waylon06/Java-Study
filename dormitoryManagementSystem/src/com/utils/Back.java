package com.utils;

import com.dao.UserDao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Back {
    private JTable table;
    private JFrame jf;
    private JPanel p1;
    private JButton button1;
    private Connection conn = null;
    private PreparedStatement prep = null;
    private ResultSet rs;

    public void regulator(int c) throws SQLException {
        Vector rowDate,columnNames;
        JScrollPane jScrollPane=null;

//        String[] col = {"学号","姓名","班级","寝室楼","楼层","寝室号","床位"};
        columnNames  = new Vector();
        columnNames.add("学号");
        columnNames.add("姓名");
        columnNames.add("班级");
        columnNames.add("寝室楼");
        columnNames.add("楼层");
        columnNames.add("寝室号");
        columnNames.add("床位");

        if (c == 1) {
            String sql1 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位' from student, building where student.sid = building.sid and back = 0 group by student.sid ";
            conn = MysqlConnect.getConn();
            prep = conn.prepareStatement(sql1);
        }
        else if (c == 2){
            String sql2 = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位'  from student, building where student.sid = building.sid group by student.sid ";
            conn = MysqlConnect.getConn();
            prep = conn.prepareStatement(sql2);
        }
        rowDate = new Vector();
        rs = prep.executeQuery();
        rs.beforeFirst();
            while(rs.next()){
                Vector hang=new Vector();
                hang.add(rs.getString(1));
                hang.add(rs.getString(2));
                hang.add(rs.getString(3));
                hang.add(rs.getString(4));
                hang.add(rs.getString(5));
                hang.add(rs.getString(6));
                hang.add(rs.getString(7));
                rowDate.add(hang);
            }
        JFrame jframe = new JFrame("未归人员信息");
        JTable jTable =new JTable(rowDate, columnNames);
        jScrollPane=new JScrollPane(jTable);
        jframe.add(jScrollPane);


//        窗口点叉结束程序
//        jframe.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
        jframe.setBounds(200,200,450,400);
        jframe.setVisible(true);

    }

}
