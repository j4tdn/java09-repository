package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02 {

	private static final String pathname = "apple" + File.separator + "data.txt";
	private static AppleService service;

	static {
		service = new AppleServiceImpl();
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
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<String> result = null;
		List<Apple> resultApple = new ArrayList<Apple>();
		try {
			result = Files.readAllLines(file.toPath());

			List<Apple> invetoryResult = result.stream().map(line -> transfer(line)).collect(Collectors.toList());
			invetoryResult.stream().forEach(System.out::println);
//			result.forEach(line -> {
//				String[] e = line.split(", ");
//				resultApple.add(transfer(line));
//			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resultApple.forEach(System.out::println);

	}

	public static Apple transfer(String line) {
		String[] e = line.split(", ");
		if (e.length != 4) {
			throw new IllegalArgumentException();
		}
		return new Apple(e[0], e[1], Double.valueOf(e[2]), e[3]);
	}
}
