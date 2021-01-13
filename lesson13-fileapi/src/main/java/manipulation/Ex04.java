package manipulation;

import java.io.File;
import java.util.Properties;

import utils.FileUtils;

public class Ex04 {
	private static final String pathname = "application/config.properties";
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		Properties props = FileUtils.getProperties(file);
		
		System.out.println("size: " + props.size());
		System.out.println("database: " + props.getProperty("database"));
	} 
}
