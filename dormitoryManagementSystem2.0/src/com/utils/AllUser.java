package com.utils;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class AllUser extends JFrame {
    private JScrollPane jsp = new JScrollPane();
    private JTable table = new JTable();

    private int row;
    private MyModel model;


    public AllUser() {
        setTitle("显示所有人员");
        setSize(500, 400);
        setResizable(false); // 不可改变窗口大小
        // 获取屏幕大小和当前frame的大小
        Dimension thisScreen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension thisFrame = this.getSize();
        // 使启动窗口位于屏幕的正中心
        setLocation((thisScreen.width - thisFrame.width) / 2,
                (thisScreen.height - thisFrame.height) / 2);
        // 设置单击窗口的【关闭】按钮时将发生相应的动作
        setDefaultCloseOperation(HIDE_ON_CLOSE);

        setLocationRelativeTo(null);

        model = new MyModel();
        table.setModel(model);
        table.getColumnModel().getColumn(0).setHeaderValue("学号");
        table.getColumnModel().getColumn(1).setHeaderValue("姓名");
        table.getColumnModel().getColumn(2).setHeaderValue("班级");
        table.getColumnModel().getColumn(3).setHeaderValue("寝室楼");
        table.getColumnModel().getColumn(4).setHeaderValue("楼层");
        table.getColumnModel().getColumn(5).setHeaderValue("寝室号");
        table.getColumnModel().getColumn(6).setHeaderValue("床位");

        // 设置可见视图的接口
        jsp.setViewportView(table);
        // 定义表格 宽500，高度400
        jsp.setPreferredSize(new Dimension(500, 400));
        // 设置横向和垂直滚动条可见
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        this.setLayout(new BorderLayout());
        this.add(jsp);
    }


    class MyModel extends AbstractTableModel {
        private int row;
        private int column;
        private ResultSet rs;
        private Statement stmt;
        private String sql = "select student.sid '学号', sname '姓名', classes '班级', building '寝室楼',floor '楼层', house '寝室号', bed '床位' from student, building where student.sid = building.sid and back = 0 group by student.sid";

        public MyModel() {
            try {
                stmt = MysqlConnect.getConn().createStatement();
                rs = stmt.executeQuery(sql);
                rs.last();// 将光标移到最后一行
                row = rs.getRow();// 获取行号(最大行索引)
                ResultSetMetaData rsmd = rs.getMetaData();// 通过结果集对象来获取
                column = rsmd.getColumnCount();// 获取列数
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public int getRowCount() {
            return row;
        }

        @Override
        public int getColumnCount() {
            return column;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Object value = null;
            try {
                rs.absolute(rowIndex + 1);
                value = rs.getString(columnIndex + 1);// 获取表里的数据
            } catch (Exception e) {
                e.printStackTrace();
            }
            return value;
        }

    }

}
