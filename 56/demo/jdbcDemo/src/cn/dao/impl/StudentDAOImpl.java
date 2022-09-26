package cn.dao.impl;

import cn.dao.IStudentDAO;
import cn.demo.Student;

import java.sql.*;

public class StudentDAOImpl implements IStudentDAO {
    @Override
    public void save(Student student) {
        Connection connection = null;
        PreparedStatement statement = null;
        try{
            //        1.加载注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//        2.获取连接对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo?serverTimezone=GMT%2B8", "root", "629000");

//        3.执行SQL语句
            String sql = "insert into student(name, email, age) values('"+student.getName()+"', '"+student.getAge()+"', 18)";
            statement = connection.prepareStatement(sql);
//            4.设置？参数值
            statement.setObject(1, student.getName());
            statement.setObject(2, student.getEmail());
            statement.setObject(3, student.getAge());

        }catch(Exception e){
            e.printStackTrace();
        }finally {
//            5.释放资源
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
