package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



public class DBCconnection {
//	private static final String URL = "jdbc:mysql://localhost:3306/java09_shopping";
//	private static final String User = "root";
//	private static final String Password = "1234";
	public static Connection connection;

	public static Connection getConnection() {
		if (connection == null) {
			// driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Properties props = Dbprovider.getProperties();
				connection = DriverManager.getConnection(
						props.getProperty("URL"),
						props.getProperty("User"),
						props.getProperty("Password"));
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
