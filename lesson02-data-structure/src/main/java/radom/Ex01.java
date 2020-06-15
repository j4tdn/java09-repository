package radom;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int number = 30 + rd.nextInt(21);
		System.out.println("number :" + number);

		String[] student = { "nam", "quang", "chanh" };
		System.out.println("student :" + student[rd.nextInt(student.length)]);

	}

}
