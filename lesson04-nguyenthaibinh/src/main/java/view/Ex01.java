package view;

import java.util.Scanner;

import beans.Student;

public class Ex01 {

	public static void main(String[] args) {
		Student student1 = new Student("102160081", "Nguyen Thai Binh", 8.2f, 9.5f);
		Student student2 =  new  Student("102160082", "Dang Dinh Hoang", 8.5f, 9.2f);
		Student student3 = new Student();
		inputOfStudent(student3);
		Student[] listStudent = {
				student1, student2, student3
		};
		System.out.println("=============");
		System.out.println("Bang danh sach sinh vien");
		System.out.printf("%s%20s%20s%20s%20s%n","MSSV","HoVaten","DiemLT","DiemTH","DiemTB");
		outputOfStudent(listStudent);
	}
	
	public static void inputOfStudent(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien");
		System.out.println("===========");
		System.out.println("Nhap ma so sinh vien");
		student.setStudentCode(sc.nextLine());
		System.out.println("Nhap ho ten sinh vien");
		student.setFirstAndLastName(sc.nextLine());
		System.out.println("Nhap diem li thuyet");
		student.setTheoreticalPoint(sc.nextFloat());
		sc.nextLine();
		System.out.println("Nhap diem thuc hanh");
		student.setPracticePoint(sc.nextFloat());
	}
	public static void outputOfStudent(Student[] listStudent) {
		for(Student student : listStudent) {
			System.out.printf("%s%20s%20s%20s%20s%n", student.getStudentCode(),
					student.getFirstAndLastName(),
					String.valueOf(student.getTheoreticalPoint()),
					String.valueOf(student.getPracticePoint()),
					String.valueOf(student.mediumScore()));
		}
	}
}
