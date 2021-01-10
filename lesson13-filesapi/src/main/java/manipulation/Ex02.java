package manipulation;

import java.awt.Desktop;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.FileUtils;

public class Ex02 {
	
	private static AppleService service;
	private static String pathname;
	
	static {
		service = new AppleServiceImpl();
		pathname = "apple" + File.separator + "data.txt";
	}
	
	public static void main(String[] args) {
		File file = new File(pathname);
		Path path = Paths.get(pathname);
		
		//write data into apple/data.txt
		if (!file.exists() && !file.canWrite()) {
			return;
		}
		
		List<Apple> inventory = service.getAll();
		List<String> lines = inventory.stream()
									.map(Apple::toString)
									.collect(Collectors.toList());
		try {
			Files.write(file.toPath(), lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Write file success");
		
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("===== READ FILE ====");
		
		List<String> result = null;
		try {
			result = Files.readAllLines(path);
			List<Apple> inventoryResult = result.stream()
												.map(line -> transfer(line))
												.collect(Collectors.toList());
			inventoryResult.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static Apple transfer(String line) {
		String[] res = line.split(", ");
		if (res.length != 4) {
			throw new IllegalArgumentException();
		}
		return new Apple(res[0], res[1], Double.parseDouble(res[2]), res[3]);
	}
}
