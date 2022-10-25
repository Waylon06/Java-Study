package com.waylon.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
//        初始化界面
        initJFrame();
//        初始化菜单
        initJMenuBar();


//        设置显示,写到最后
        this.setVisible(true);
    }

    private void initJMenuBar() {
        //        创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

//        创建菜单上选项对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

//        创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

//        将条目添加进选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

//        将选项添加进菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

//        给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);
//        设置界面标题
        this.setTitle("拼图游戏 V1.0");
//        设置界面置前
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置关闭模式
        this.setDefaultCloseOperation(3);
    }
}
