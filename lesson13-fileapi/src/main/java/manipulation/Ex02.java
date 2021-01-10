package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;


import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02 {
	private static AppleService services;
	static {
		services = new AppleServiceImpl();
	}
	
	private static final String pathname= "apple" + File.separator + "data.txt";
	public static void main(String[] args) {
		
		List<Apple> inventory = services.getAll();
		List<String> lines = inventory.stream()
									  .map(Apple::toString)
									  .collect(Collectors.toList());
		File file = new File(pathname);
		
		if (!file.exists() || !file.canWrite()) {
			return;
		}
		
		for (Apple apple :inventory) {
			try {
				Files.write(file.toPath(),lines );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Write file success !");
		
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			List<String> result = Files.readAllLines(file.toPath());
			List<Apple> inventoryResult = result.stream()
										  .map(line -> transfer(line))
										  .collect(Collectors.toList());
			inventoryResult.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Apple transfer (String line) {
		String[] result = line.split(", ");
		if (result.length != 4) {
			throw new IllegalArgumentException();
		}
		return new Apple(result[0], result[1], Double.parseDouble(result[2]), result[3]);
	}
}
