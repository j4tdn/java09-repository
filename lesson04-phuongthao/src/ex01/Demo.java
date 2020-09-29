package ex01;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Student student1 = new Student(1221, "Nguyen A", 8, 9);
			
		Student student2 = new Student(1222, "Nguyen B", 7, 10);
				
		Student student3 = new Student();
		System.out.println("Nhap thong tin sv 3: ");
		Scanner ip = new Scanner(System.in);
		
		System.out.println("id: ");
		student3.id = Integer.parseInt(ip.nextLine());
		System.out.println("name: ");
		student3.name=ip.nextLine();
		System.out.println("LT: ");
		student3.LT=Float.parseFloat(ip.nextLine());
		System.out.println("TH: ");
		student3.TH=Float.parseFloat(ip.nextLine());
		student3.getGPA();
		
		System.out.println("===============================");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
		
	
		
		
		
	}

}
