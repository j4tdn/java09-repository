package manipulation;

import java.io.File;
import java.util.List;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.FileUtils;
import utils.ListUtils;

public class Ex03 {
	private static final String pathname = "apple/data-serial.txt";
	private static AppleService service;
	static {
		service = new AppleServiceImpl();
	}
	public static void main(String[] args) {
		File file = FileUtils.createFile(pathname);
//		List<Apple> inventory = service.getAll();
//		FileUtils.writeObject(file, inventory);
//		FileUtils.open(file);
		List<Apple> result = (List<Apple>)FileUtils.readObject(file).get();
		ListUtils.show(result);
	}
}
