package bt1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Student sv1 = new Student(109, "Thanh Huyền", 9, 9);
		Student sv2 = new Student(107, "Phương Hùng", 9, 10);
		Student sv3 = new Student();
		sv3 = Input();
		
		System.out.printf("\n%-15s %-25s %10s %10s %10s\n", "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB");
		System.out.printf("%-15s %-25s %10s %10s %10s\n", sv1.getId(), sv1.getName(), sv1.getMarkTheory()
														,sv1.getMarkPrac(), sv1.getMarkAver());
		System.out.printf("%-15s %-25s %10s %10s %10s\n", sv2.getId(), sv2.getName(), sv2.getMarkTheory()
														,sv2.getMarkPrac(), sv2.getMarkAver());
		System.out.printf("%-15s %-25s %10s %10s %10s\n", sv3.getId(), sv3.getName(), sv3.getMarkTheory()
														,sv3.getMarkPrac(), sv3.getMarkAver());
		
	}
	
	private static Student Input(){
		Scanner sc = new Scanner(System.in);
		Student sv = new Student();
		System.out.println("Nhập mã sinh viên: ");
		sv.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Nhập tên: ");
		sv.setName(sc.nextLine());
		System.out.println("Nhập điểm lý thuyết:");
		sv.setMarkTheory(sc.nextFloat());
		System.out.println("Nhập điểm thực hành: ");
		sv.setMarkPrac(sc.nextFloat());
		return sv;
	}
	
}
