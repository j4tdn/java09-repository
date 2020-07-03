package main;

import java.util.Scanner;

import object.Vehicle;

public class Ex02 {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		Vehicle motorbike1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
		Vehicle motorbike2 = new Vehicle("Lê Minh Tính", "Ford ranger", 3000, 250000000);
		Vehicle motorbike3 = new Vehicle("Lê Văn Cường", "Landscape", 1500, 1000000000);

		

		System.out.printf("%-20s%-15s%-15s%-18s%-18s\n", "Chủ xe", "  loại xe   ", "  dung tích  ", "  giá trị  ",
				"  thuế");
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println(motorbike1);
		System.out.println(motorbike2);
		System.out.println(motorbike3);
	}
}
