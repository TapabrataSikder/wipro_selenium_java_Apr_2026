package Day_12;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection_day_12 {
    private static final String URL = "jdbc:mysql://localhost:3306/mydata";
    private static final String USER = "root";
    private static final String PASSWORD = "Admin@123";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}