package com.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Interface {
    private static JPanel panel;
    private static JLabel label1,label2;
    private static JButton delButton, exitButton;
    private static JTextField jTextField;
    private static JPasswordField passwordField;
    private static Connection conn;
    private static PreparedStatement del;


    public void regulator() {
        JFrame jf = new JFrame("辅导员删除界面");
//        jf.setSize(400,500);
//        jf.setLocation(400,300);
        jf.setBounds(400,400,400,400);

        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panel = new JPanel(new FlowLayout());
//        label1 = new JLabel("用户名");
//        label2 = new JLabel("密码");
        delButton = new JButton("删除辅导员");
        delButton.addActionListener(this::actionPerformed);
        exitButton = new JButton("退出");
//        exitButton.addActionListener(this::actionPerformed);
//        jTextField = new JTextField(16);
//        passwordField = new JPasswordField(16);

//        panel.add(label1);
//        panel.add(jTextField);
//        panel.add(label2);
//        panel.add(passwordField);
        panel.add(delButton);
        panel.add(exitButton);

        jf.add(panel);
        jf.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
//        if (e.getSource()==loginButton){
//            if (jTextField.getText().contains("student") && passwordField.getText().contains("123456")){
//                JOptionPane.showMessageDialog(null,"学生端登录成功！" );
//
//            }
//            else if (jTextField.getText().contains("teacher") && passwordField.getText().contains("123456")){
//                JOptionPane.showMessageDialog(null,"辅导员端登录成功！" );
//            }
//            else if (jTextField.getText().contains("root") && passwordField.getText().contains("123456")){
//                JOptionPane.showMessageDialog(null,"监管者端登录成功！" );
//            }
//
//                else{
//                JOptionPane.showConfirmDialog(null,"用户名或者密码错误");
//            }
//            }
        if (e.getSource() == delButton) {
            try {
                del();
            } catch (SQLException ex) {
            }
        }
        else if (e.getSource()==exitButton){
            System.exit(0);
        }
    }
    public void del() throws SQLException {
        System.out.println("请输入需删除辅导员的工号：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sql2 = "delete from admin where aid= "+a;
        conn = MysqlConnect.getConn();
        del = conn.prepareStatement(sql2);
        int i = del.executeUpdate();
        if (i==0){
            System.out.println("删除失败");
        }
        else {
            System.out.println("删除成功");
        }
    }
}
