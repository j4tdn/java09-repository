package manipulation;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import util.ListUtils;

import static util.FileUtils.*;

public class Ex03 {
	private static final String pathname = "apple/data-serial.txt";
	
	private static AppleService service = new AppleServiceImpl();
	
	public static void main(String[] args) {
		File file = new File(pathname);
//		List<Apple> inventory = service.getAll();
//		FileUtils.writeObject(file, inventory);
//		FileUtils.open(file);
		
		Optional<Object> objOpt = readObject(file);
		List<Apple> apples = (List<Apple>) objOpt.orElse(Collections.EMPTY_LIST);
		ListUtils.show(apples);
		
		
	}
}
