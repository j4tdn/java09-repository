package manipulation;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import service.AppleService;
import service.AppleServiceImpl;

public class Ex02 {
		private static AppleService sevice;
		private static String pathname ;
		static {
			sevice = new AppleServiceImpl();
			pathname = "apple" + File.separator + "data.txt";
		}
		public static void main(String[] args) {
			
			
			//write data into apple/data.txt
				
			//id, color, weight, origin
			
			
			
			File file = new File(pathname);
			if (!file.exists()&& !file.canWrite()) {
				return;
			}
			List<Apple> inventory = sevice.getAll();
			List<String> lines = inventory.stream()
					.map(Apple::toString)
					.collect(Collectors.toList());
			try {
				Files.write(file.toPath(), lines);
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("success!!! writefile");
			//Path path = Paths.get(pathname);
			System.out.println("==========readfile============");
			try {
				List<String> result=Files.readAllLines(file.toPath());
				
				List<Apple> inventoryResult = result.stream()
						.map(line->tranfer(line))
						.collect(Collectors.toList());
				System.out.println("========================");
				inventoryResult.forEach(System.out::println);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static Apple tranfer(String line) {
			String[] result =line.split(",");
			if (result.length!=4) {
				throw new IllegalArgumentException();
			}
			return new Apple(result[0],
					result[1],
					Double.parseDouble(result[2])
					,result[3]);
		}
		
}
