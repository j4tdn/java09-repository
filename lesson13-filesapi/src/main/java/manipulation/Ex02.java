package manipulation;

import java.awt.Desktop;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceimpl;

public class Ex02 {
	
	private static String pathname = "apple" + File.separator + "data.txt";
	private static AppleService service;

	static {
		service = new AppleServiceimpl();
	}

	public static void main(String[] args) {
		File file = new File(pathname);
		if (!file.exists() || !file.canWrite()) {
			return;
		}
		List<Apple> inventory = service.getAll();
		List<String> lines = inventory.stream().map(Apple::toString).collect(Collectors.toList()); 
		
		//write data apple in data.txt
		//id,color,weight,origin
		try {
			Files.write(file.toPath(),lines);
			//Files.write(file.toPath(), lines, StandardOpenOption.APPEND);
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			List<String> result=Files.readAllLines(file.toPath());
			List<Apple> inventoryResult= result.stream()
											   .map(line->transfer(line))
											   .collect(Collectors.toList());
			inventoryResult.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public static Apple transfer(String line) {
		String[] result = line.split(", ");
		if(result.length!=4) {
			throw new IllegalArgumentException();
		}
		return new Apple(result[0],result[0],Double.parseDouble(result[2]),result[3]);
	}
}
