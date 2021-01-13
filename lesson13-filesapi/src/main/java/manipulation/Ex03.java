package manipulation;

import java.io.File;
import java.util.List;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.ListUtils;

import static utils.FileUtils.*;

public class Ex03 {
	
	private static final String pathname = "apple/data-serial.txt";
	private static AppleService service;
	
	static {
		service = new AppleServiceImpl();
	}
	
	public static void main(String[] args) {
		File file = createFile(pathname);
		List<Apple> inventory = service.getAll();
		writeObject(file, inventory);
		open(file);
//		@SuppressWarnings("unchecked")
//		List<Apple> result = (List<Apple>) readObject(file).get();
//		ListUtils.show(result);
	}
}
