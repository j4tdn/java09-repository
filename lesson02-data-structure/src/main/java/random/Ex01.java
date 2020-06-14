package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(10);
		System.out.println("number: " + number);

		String[] students = { "Nam", "Tèo", "Hoàng" };
		System.out.println(students[rand.nextInt(students.length)]);
	}
}
