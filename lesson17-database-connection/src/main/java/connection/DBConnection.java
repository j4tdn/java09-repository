package connection;
//tuong tac truc tiep voi du lieu

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	
	
	private static Connection connection;
	
	public static Connection getConnection() {
		if(connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Properties properties=DBProvider.getProperties();
				System.out.println("url:"+properties.getProperty("url"));
				connection=DriverManager.getConnection(
						properties.getProperty("url"),
						properties.getProperty("user"),
						properties.getProperty("password")
						
						);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
		
	}
	
	public static void main(String[] args) {
		System.out.println("info:"+ getConnection());
		
	}
	
}
