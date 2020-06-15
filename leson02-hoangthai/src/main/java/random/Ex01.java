package random;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(10);
		// a-b=a+nextint(b-a+1)
		System.out.println("number : " + number);
		String[] students = { "a", "b", "c" };
	}

}
