package mock.project.thuctap.connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBContext {
    
	private static String DB_URL = "jdbc:mysql://localhost:8000/product_mock_thuctap";
    private static String USER_NAME = "root";
    private static String PASSWORD = "asdzxc123";
    public static Connection getConnection() throws ClassNotFoundException, Exception{
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            	System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
    public static void main(String args[]) {
        try {
            System.out.println(new DBContext().getConnection());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
 