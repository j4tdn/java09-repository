package manipulation;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import util.FileUtils;
import util.ListUtils;

import static util.FileUtils.*;

public class Ex04 {
	private static final String pathname = "application/config.properties";
	
	private static AppleService service = new AppleServiceImpl();
	
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
		Properties props = FileUtils.getProperties(file);
		
		System.out.println("size" + props.size());
		System.out.println("database: " + props.getProperty("database"));
	}
}
