package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;
import utils.FileUtils;

public class Ex02 {
	private static String pathname;
	private static AppleService service;
	
	static {
		service = new AppleServiceImpl();
		pathname = "apple" + File.separator + "data.txt";
	}
	public static void main(String[] args) {
		
		// write data into apple/data.txt
		// id, color, weight, origin
		File file = new File(pathname);

		
		if (!file.exists() || !file.canWrite()) {
			return;
		}
		
		List<Apple> inventory = service.getAll();
		List<String> lines = inventory.stream().map(Apple::toString).collect(Collectors.toList());
		try {
			Files.write(file.toPath(), lines);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//option2
		
/*		for(Apple apple: inventory) {
			String line = apple.getId() + ", " + apple.getColor() + ", " + apple.getWeight() + ", " + apple.getOrigin();
			FileUtils.writeLine(file, line);
		}*/
		
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("WRITE FILE SUCCESS!");
		System.out.println("=============READ FILE============");
		
		// read file 
		List<String> list = new ArrayList<>();
		List<Apple> listApple = new ArrayList<>();
		
		try {
			list = Files.readAllLines(file.toPath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
/*		for(String line: list) {
			Apple apple = toApple(line);
			listApple.add(apple);
		}*/
		listApple = list.stream()
				.map(line -> toApple(line))
				.collect(Collectors.toList());
		listApple.forEach(System.out::println);
	}
	
	private static Apple toApple(String apple) {
		String[] value = apple.split(", ");
		if(value.length != 4) {
			throw new IllegalArgumentException();
		}
		Apple result = new Apple(value[0], value[1], Double.parseDouble(value[2]), value[3]);	
		return result;
	}
}
