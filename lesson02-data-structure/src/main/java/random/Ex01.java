package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd = new Random();
		// a - b = a + nextInt(b - a + 1)
		int number = 30 + rd.nextInt(21);
		System.out.println("number :" + number);
		String[] students = {"Nam", "Teo", "Hoang"};
		System.out.println(students[rd.nextInt(students.length)]);
	}
}
