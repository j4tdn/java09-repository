package exercises;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import entities.Student;

public class Ex1 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Student s1 = new Student(102180070, "Trinh Nhat Hung", 8f, 8.5f);
		Student s2 = new Student(102180000, "Nguyen Van A", 7f, 8.1f);
		Student s3 = new Student();
		input(s3);
			
		System.out.printf("%-15s%-30s%-20s%-20s%-10s\n", "id", "name", "practice point", "theory point","Average Point");
		System.out.printf("%-15d%-30s%-20.2f%-20.2f%-10.2f\n",s1.getId(),s1.getName(),s1.getPracticePoint(),s1.getTheoryPoint(),s1.getAveragePoint());
		System.out.printf("%-15d%-30s%-20.2f%-20.2f%-10.2f\n",s2.getId(),s2.getName(),s2.getPracticePoint(),s2.getTheoryPoint(),s2.getAveragePoint());
		System.out.printf("%-15d%-30s%-20.2f%-20.2f%-10.2f\n",s3.getId(),s3.getName(),s3.getPracticePoint(),s3.getTheoryPoint(),s3.getAveragePoint());
	}
	
	public static void input (Student student) {
	    int id =0;
	    String name = "";
	    float practicePoint = 0;
	    float theoryPoint = 0;
	    
	    System.out.print("Nhap id:");
	    id = scanner.nextInt();
	    System.out.print("Nhap ten:");
	    scanner.nextLine();
	    name = scanner.nextLine();
	    System.out.print("Nhap diem li thuyet:");
	    theoryPoint = scanner.nextFloat();
	    System.out.print("Nhap diem thuc hanh:");
	    practicePoint = scanner.nextFloat();
	    
	    student.setId(id);
	    student.setName(name);
	    student.setPracticePoint(practicePoint);
	    student.setTheoryPoint(theoryPoint);
	}
}
