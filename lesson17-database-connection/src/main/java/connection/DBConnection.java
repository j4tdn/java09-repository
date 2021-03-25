package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	private static Connection connection;
	
	public static Connection getConnection() {
		if(connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Properties properties = DBProvider.getProperties();
				connection = DriverManager.getConnection(properties.getProperty("URL")
						, properties.getProperty("USER")
						, properties.getProperty("PASSWORD"));
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
