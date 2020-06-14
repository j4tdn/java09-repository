package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd=new Random();
		int number =rd.nextInt(2);
		System.out.println(number);
		String [ ] studen= {"nam","teo"};
		System.out.println(studen[rd.nextInt(studen.length)]);

	}
}
