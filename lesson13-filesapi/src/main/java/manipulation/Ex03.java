package manipulation;

import java.io.File;
import java.util.List;
import java.util.Optional;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.ListUtils;

import static utils.FileUtils.*;
public class Ex03 {
	private static String pathname ="apple/data-serial.txt";
	private static AppleService sevice;
	static {
		sevice = new AppleServiceImpl();
		
	}
	public static void main(String[] args) {
		File file =createFile(pathname);
		//List<Apple> inventory = sevice.getAll();
		//writeObject(file, inventory);
		//open(file);
		
			// readObject(file).ifPresent(System.out::println);
//			@SuppressWarnings("unchecked")
//			List<Apple> result =(List<Apple>)readObject(file).get();
//			ListUtils.show(result);
//	
	}
}
