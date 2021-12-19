package com.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Interface {
    private static JPanel panel;
    private static JLabel label1,label2;
    private static JButton loginButton, exitButton;
    private static JTextField jTextField;
    private static JPasswordField passwordField;

//    public void regulator() {
//        JFrame jf = new JFrame("管理登录界面");
////        jf.setSize(400,500);
////        jf.setLocation(400,300);
//        jf.setBounds(400,400,400,400);
//
//        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        panel = new JPanel(new FlowLayout());
//        label1 = new JLabel("用户名");
//        label2 = new JLabel("密码");
//        loginButton = new JButton("登录");
//        loginButton.addActionListener(this::actionPerformed);
//        exitButton = new JButton("退出");
//        exitButton.addActionListener(this::actionPerformed);
//        jTextField = new JTextField(16);
//        passwordField = new JPasswordField(16);
//
//        panel.add(label1);
//        panel.add(jTextField);
//        panel.add(label2);
//        panel.add(passwordField);
//        panel.add(loginButton);
//        panel.add(exitButton);
//
//        jf.add(panel);
//        jf.setVisible(true);
//    }
//    public void actionPerformed(ActionEvent e){
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
//        else if (e.getSource()==exitButton){
//            System.exit(0);
//        }
//    }
}
