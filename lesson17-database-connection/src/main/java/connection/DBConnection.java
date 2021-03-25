package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	private static final String URL = "jdbc:mysql://localhost:3306/java09_shopping";
	private static final String USER = "root";
	private static final String PASSWORD = "123456789";
	
	private static Connection connection;

	
	public static Connection getConnection() {
		// driver
		if(connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Properties props =DBProvider.getProperties();
				connection = DriverManager.getConnection(
						props.getProperty("URL"),
						props.getProperty("USER"),
						props.getProperty("PASSWORD"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			return connection;
		}
	public static void main(String[] args) {
		System.out.println("info: " + getConnection());
	}
}
