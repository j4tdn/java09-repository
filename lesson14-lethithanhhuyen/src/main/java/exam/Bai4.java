package exam;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bai4 {
	public static void main(String[] args) {
		String pathname = "student.txt";
		File file = new File(pathname);
		Path path = Paths.get(pathname);
		List<Student> students = new ArrayList<>();
		try {
			List<String> readFile = Files.readAllLines(path);
			students = readFile.stream()
					.map(s -> transform(s))
					.collect(Collectors.toList());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//1.Tăng dần theo ĐTB, tăng dần theo họ tên
		students.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return (int) (o1.getPoint()-o2.getPoint());
			}
			
		})
		.forEach(System.out::println);
		
		//2
		students.stream()
			.filter(student -> student.getPoint()>8)
			.forEach(System.out::println);
		
		//3
		students.stream()
			.filter(student -> student.getGender().equals("Nữ"))
			.forEach(System.out::println);
		
		//4
		students.stream()
		.distinct()
		.forEach(System.out::println);
	}
	
	private static Student transform(String s) {
		String[] res = s.split(", ");
		return new Student(res[0], res[1], Double.parseDouble(res[2]), res[3]);
	}
}
