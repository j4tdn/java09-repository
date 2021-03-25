package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBProvider {
	private static File file = new File("config.properties");
	public static Properties getProperties () {
		Properties properties = new Properties();
		InputStream ips;
		try {
			ips = new FileInputStream(file);
			properties.load(ips);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
}
