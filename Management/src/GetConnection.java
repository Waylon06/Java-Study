import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**连接到SQL server
 * @author LB
 * @create 2018-12-24 22:03
 */
public class GetConnection {
    private Connection con=null;
    public Connection GetConnection(){
        String URL="jdbc:mysql://localhost:3306/student?serverTimezone=Asia/Shanghai&characterEncoding=UTF-8";
        String USER="root";
        String KEY="123456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(URL, USER, KEY);
        } catch (Exception e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return con;
    }
}
