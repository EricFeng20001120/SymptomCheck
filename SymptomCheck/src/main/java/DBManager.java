import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBManager {
public Connection getConnection(){
	try {
		String dbName = System.getProperty("test");
		String userName = System.getProperty("Eric");
		String password = System.getProperty("yixin.feng5620392");
		String hostname = System.getProperty("test.ckjjmy0ezycy.us-east-2.rds.amazonaws.com");
		String port = System.getProperty("3306");
		String jdbcUrl = "jdbc:mysql://" + hostname + ":" +
		    port + "/" + dbName + "?user=" + userName + "&password=" + password;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(jdbcUrl,userName,password);
		return conn;
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
	
}
}
