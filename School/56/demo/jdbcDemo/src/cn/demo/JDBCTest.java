package cn.demo;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
    @Test
    public void insertTest() throws Exception {
//        1.加载注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
//        2.获取连接对象
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?serverTimezone=GMT%2B8", "root", "629000");

//        3.创建/获取语句对象
           Statement statement = connection.createStatement();
//        4.执行SQL语句
        String sql = "insert into student(name, email, age) values('Waylon', '2135@qq.com', 18)";
        int i = statement.executeUpdate(sql);
//        5.释放资源
        statement.close();
        connection.close();
    }
}
