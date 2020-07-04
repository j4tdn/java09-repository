package exercise02;

import java.util.Scanner;

public class Exercise02 {
	public static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int n=0;
		Vehicle[] result = new Vehicle[100];
		do {
			System.out.println("MENU:");
			System.out.println("1. Nhập thông tin và tạo các đối tượng");
			System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
			System.out.println("Thoát");
			System.out.print("Nhập số thứ tự công việc muốn thực hiện:");
			n = ip.nextInt();
			switch (n) {
				case 1: 
					result = Input();
					break;
				case 2:
					Output(result);
					break;
			}
		} while (n != 3);
	}
	
	private static Vehicle[] Input() {
		Vehicle[] result = new Vehicle[100];
		for(int i=0; i<3; i++) {
			ip.nextLine();
			System.out.println("Người thứ " +(i+1) + ":");
			System.out.print("Tên chủ xe:");
			String x= ip.nextLine();
			System.out.print("Loại xe:");
			String y= ip.nextLine();
			System.out.print("Dung tích:");
			long z= ip.nextLong();
			System.out.print("Trị giá:");
			double m= ip.nextDouble();
			result[i]= new Vehicle(x, y, z, m);
		}
		return result;
	}
	
	private static void Output(Vehicle[] arr) {
		System.out.printf("\n%-30s%-20s%10s%30s%20s\n","Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("===========================================================================================================");
		for (int i=0; i<3; i++) {
			Vehicle x = arr[i];
			if (arr[i]== null) System.out.println("===");
			System.out.printf("%-30s%-20s%10d%30.2f%20.2f\n", x.getName(), x.getModel(), x.getCapacity(), x.getPrice(), x.tax());
		}
	}
}
