package viewExercises;

import java.util.Scanner;

import exercises.Vehicle;

public class Ex02 {
		private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int choice = -1;
		Vehicle[] vehicle = new Vehicle[3];
		do {
			System.out.println("=============MENU===========");
			System.out.println("1. Nhập thông tin và tạo các đối tượngxe1, xe2, xe3");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe.");
			System.out.println("3. Thoát.");
			System.out.println("Nhập lựa chọn của bạn: ");
			choice = ip.nextInt();
			
			switch(choice) {
			case 1:
				for(int i = 0; i < 3; i++) {
					String name;
					String type;
					double price;
					double cylinder;
					System.out.println("Nhập tên chủ xe: ");
					name = ip.nextLine();
					ip.nextLine();
					System.out.println("Nhập loại xe: ");
					type = ip.nextLine();
					System.out.println("Nhập dung tích: ");
					cylinder = ip.nextDouble();
					System.out.println("Nhập trị giá: ");
					price = ip.nextDouble();
					
					vehicle[i] = new Vehicle(name,type, cylinder, price);
				}
				break;
			case 2:
				System.out.printf("%-20s%-20s%20s%20s%20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
				System.out.println("===================================================================");
				for(int i = 0; i < 3; i++) {
					System.out.println(vehicle[i]);
				}
				break;
			case 3:
				System.out.println("THOÁT!!!!!!!!!!!!");
				break;
			}
			
			
		} while(choice != 3);
	}
}
