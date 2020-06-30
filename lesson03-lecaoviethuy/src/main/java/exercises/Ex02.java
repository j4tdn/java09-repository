package exercises;

import entities.Vehicle;

public class Ex02 {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 35000000d, 100);
		Vehicle vehicle2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 250000000d, 3000);
		Vehicle vehicle3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 10000000d, 1800);
		
		System.out.printf("%-20s%-15s%15s%20s%20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println("==========================================================================================");
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		System.out.println(vehicle3);
		
	}
}
