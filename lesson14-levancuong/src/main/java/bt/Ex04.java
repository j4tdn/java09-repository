package bt;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex04 {
	public static void main(String[] args) {
		File file=new File("students.txt");
		List<Student> Students=readFile(file.toPath());
		Students.forEach(System.out::println);
		//1: sort dtb
		System.out.println("1:");
		Students.stream().sorted(Comparator.comparing(dtb ->dtb.getAverageMark())).forEach(System.out::println);
		//2.dtb>8
		System.out.println("2:");
		Students.stream().filter(dtb -> dtb.getAverageMark()>8).forEach(System.out::println);
		//3.sv nu
		System.out.println("3:");
		Students.stream().filter(gt-> gt.getGioiTinh().equals("Nu")).forEach(System.out::println);
		//4.find
		
	}
	
	private static List<Student> readFile(Path path) {
		List<Student> result=new ArrayList<Student>();
		try {
			List<String> elements=Files.readAllLines(path);
			
			for(String element :elements) {
				String[] temp=element.split(", ");
				Student item =new Student(temp[0],temp[1],Double.parseDouble(temp[2]),temp[3]);
				result.add(item);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
