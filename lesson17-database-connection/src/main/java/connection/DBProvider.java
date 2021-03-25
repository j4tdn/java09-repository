package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBProvider {
	private static Connection connection;

	public static Properties getProperties() {
		if (connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Properties props = new Properties();
				connection = DriverManager.getConnection(
						props.getProperty("URL"), 
						props.getProperty("USER"),
						props.getProperty("PASSWORD"));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return (Properties) connection;

	}

	public static void main(String[] args) {
		System.out.println("info: " + getProperties());
	}

}
