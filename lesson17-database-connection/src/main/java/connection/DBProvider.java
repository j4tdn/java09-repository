package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class DBProvider {
	private static File file= new File("Config.Properties");
	public static Properties getProperties() {
		Properties props = new Properties();
		try {
			InputStream ips= new FileInputStream(file);
			props.load(ips);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	return props;
}
}
