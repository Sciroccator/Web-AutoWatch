package singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;

public class DbConnection {
	
	private static final String  JDBC_URL = "jdbc:mysql://localhost:3306/autowatch";
	private static Connection instance= null;
	
	public static Connection  getConnection() throws SQLException {
		if (instance == null) {
		Properties pro = new Properties();
		pro.put("user", "root");
		pro.put("pass","8009");
		
	instance = DriverManager.getConnection(JDBC_URL, pro.getProperty("user"),pro.getProperty("pass"));
		}
		
		
		
		
		return instance;
	}

}
