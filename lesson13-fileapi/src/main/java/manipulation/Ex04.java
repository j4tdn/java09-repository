package manipulation;

import java.io.File;
import java.util.Properties;

import util.FileUtils;

public class Ex04 {
	private static final String pathname = "application/config.properties";
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		Properties properties = FileUtils.getProperties(file);
		
		System.out.println("size:" + properties.size());
		System.out.println("database:" + properties.getProperty("database"));
	}
}
