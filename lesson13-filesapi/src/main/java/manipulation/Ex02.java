package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Severity;

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

		// write data into apple/data.txt
		// id,color,weight,origin
		File file = new File(pathname);
		Path path = Paths.get(pathname);
		if (!file.exists() || !file.canWrite()) {
			return;
		}
		List<Apple> inventory = service.getAll();
		List<String> lines = inventory.stream().map(Apple::toString).collect(Collectors.toList());
		try {
			Files.write(file.toPath(), lines);
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("write file successfull");
		System.out.println("read file");

		try {
			List<String> result = Files.readAllLines(path);
			List<Apple> inventoryResult = result.stream()
					.map(line -> transfer(line))
					.collect(Collectors.toList());
			inventoryResult.forEach(System.out::println);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static Apple transfer(String line) {
		String[] result = line.split(", ");
		if (result.length != 4) {
			throw new IllegalArgumentException();
		}
		return new Apple(result[0], result[1], Double.parseDouble(result[2]), result[3]);

	}

}
