package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class Dbprovider {
	//private static File file = new File("config.propeties");
	//private static Dbprovider dbprovider;
	private static File file = new File("config.properties");
	
	public static Properties getProperties() {
		Properties props = new Properties();
		
		try {
			
			
			InputStream ips = new FileInputStream(file);
			props.load(ips);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
		
	}
		
		
	
}
