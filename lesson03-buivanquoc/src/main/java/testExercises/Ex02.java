package testExercises;

import exercises.Vehicle;

public class Ex02 {
	public static void main(String[] args) {
		Vehicle vh1 = new Vehicle("Lê A", "toyota vios", 100, 35000000);
		Vehicle vh2 = new Vehicle("Lê B", "toyota fortuner", 3000, 250000000);
		Vehicle vh3 = new Vehicle("Lê C", "toyota camry", 1500, 1000000000);
		System.out.printf("%s%19s%20s%22s%20s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out
				.println("===========================================================================================");
		System.out.println(vh1);
		System.out.println(vh2);
		System.out.println(vh3);
	}
}
