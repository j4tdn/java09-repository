package random;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		Random rd= new Random();
		int number= rd.nextInt(10);
		System.out.println(number);
		
		String[] students= {"Nam", "Thao", "Hoang"};
		System.out.println(students[rd.nextInt(students.length)]);
	}

}
