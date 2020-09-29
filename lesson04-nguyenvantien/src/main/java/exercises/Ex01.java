package exercises;

import java.util.Scanner;

import model.Student;

public class Ex01 {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Nguyễn Văn Tiên", 9.5f, 9.6f);
		Student s2 = new Student(1, "Nguyễn Tuấn Cảnh", 9.5f, 9.6f);
		Student s3 = new Student();
		
		inputInf(s3);
		
		System.out.printf("%-10s %-30s %-15s %s\n", "MSSV", "Họ Và Tên", "Điểm LT", "Điểm TH");
		System.out.printf("%-10d %-30s %-15.3f %.3f\n", s1.getId(), s1.getName(), s1.getTheoMark(), s1.getPracMark());
		System.out.printf("%-10d %-30s %-15.3f %.3f\n", s2.getId(), s2.getName(), s2.getTheoMark(), s2.getPracMark());
		System.out.printf("%-10d %-30s %-15.3f %.3f", s3.getId(), s3.getName(), s3.getTheoMark(), s3.getPracMark());
	}

	private static void inputInf(Student s) {
		Scanner scanner = new Scanner(System.in);
		int id;
		String name;
		float theoMark;
		float pracMark;
		id = scanner.nextInt();
		scanner.nextLine();
		name = scanner.nextLine();
		theoMark = scanner.nextFloat();
		pracMark = scanner.nextFloat();
		s.setId(id);
		s.setName(name);
		s.setTheoMark(theoMark);
		s.setPracMark(pracMark);
		
	}

}
