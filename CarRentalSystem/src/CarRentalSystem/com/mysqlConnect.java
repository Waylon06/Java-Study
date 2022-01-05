package CarRentalSystem.com;

import java.sql.*;

public class mysqlConnect {
    private Connection conn = null;
    private PreparedStatement prep = null;
    private static String url = "jdbc:mysql://localhost:3306/crs?UseUnicode=true&characterEncoding=utf-8";
    private static String username = "root";
    private static String password = "123456";

    public static Connection getConn() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(url, username, password);
    }

    //关闭数据库

    public boolean login(String id, String pwd) throws SQLException {

        String sql = "select * from admin where id = ? and pwd = ?";
        conn = getConn();
        prep = conn.prepareStatement(sql);
        prep.setString(1,id);
        prep.setString(2,pwd);
        ResultSet resultSet = prep.executeQuery();
        if (resultSet.next()){
            return true;
        }else {
            return false;
        }
    }

}
