package connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/java09_shopping";
	private static final String USER = "root";
	private static final String PASSWORD = "1234";
	public static Connection connection;
	public static Connection getConnection() {
		//drive
		
		if(connection == null) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println("info: " + getConnection());
	}
}
