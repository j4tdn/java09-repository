package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02 {
	private static AppleService service = new AppleServiceImpl();
	
	private final static String pathname = "apple" + File.separator + "data.txt";
	
	public static void main(String[] args) {
		Path path = Path.of(pathname);
		File file = new File(pathname);
		List<Apple> inventory = service.getAll();
		List<String> lines = inventory.stream()
									.map(apple -> apple.getId() + ", " 
											+ apple.getColor() + ", " 
											+ apple.getWeight() + ", "
											+ apple.getOrigin())
									.collect(Collectors.toList());
		try {
			Files.write(path, lines, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		List<String> dataFromSource = null;
		try {
			dataFromSource = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if(dataFromSource != null) {
			List<Apple> appleResult = dataFromSource.stream()
											.map(Ex02::toApple)
											.collect(Collectors.toList());
			appleResult.forEach(System.out::println);
		}
		
	}
	
	private static Apple toApple(String line) {
		String[] splited = line.split(", ");
		return new Apple(splited[0], splited[1], Double.parseDouble(splited[2]), splited[3]);
	}
}
