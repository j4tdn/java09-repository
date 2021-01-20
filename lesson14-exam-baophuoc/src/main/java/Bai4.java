import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Bai4 {
	public static void main(String[] args) {
		String pathname = "D:\\java09\\workspace\\javacore\\java09-repository\\lesson14-exam-baophuoc\\student.txt";
		Path path = Paths.get(pathname);
        File file = new File(pathname);
        
        //doc du lieu tu file txt 
        try {
			List<String> result=Files.readAllLines(path);
			result.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        //sap xep theo DTB
        List<String> result = null;
		try {
			result = Files.readAllLines(file.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Stream<String> inventoryResult= result.stream().sorted();
	}
}




