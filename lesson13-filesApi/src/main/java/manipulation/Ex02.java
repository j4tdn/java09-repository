package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import javax.naming.spi.DirStateFactory.Result;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02 {

	
	//private static String pathname ="apple" + File.separator + "data.txt";
	private static AppleService service;
	private static String pathname;
	static {
		service = new AppleServiceImpl();
		pathname = "apple" + File.separator + "data.txt";
	}

	public static void main(String[] args) {

		// write data into apple/data.txt
		File file = new File(pathname);
		if (!file.exists() || !file.canWrite()) {
			return;
		}
		List<Apple> inventory = service.getAll();
		List<String> lines = inventory.stream().map(Apple::toString).collect(Collectors.toList());
		try {
			Files.write(file.toPath(), lines);
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("write file successful !");
		// id, color,weight,origin
	
	try {
		List<String> result = Files.readAllLines(file.toPath());
		List<Apple> inventoryResult = result.stream().map(line -> transfer(line)).collect(Collectors.toList());
		System.out.println("==========");
		inventoryResult.forEach(System.out::println);
		result.forEach(System.out::println);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public static Apple transfer(String line) {
		String[] result = line.split(", ");
		if(result.length !=4) {
			throw new IllegalArgumentException();
		}
		return new Apple(result[0],result[0],Double.parseDouble(result[2]),result[3]);
	}
	}
