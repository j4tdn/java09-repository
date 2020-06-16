package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) throws InterruptedException {
		Random rd = new Random();
		//a -b = a + nextInt(b-a+1)
		while(true) {
			Thread.sleep(500);
			int number=20+ rd.nextInt(6);
		System.out.println("number: " + number);
		String[] student = {"Nam", "Teo", "Hoa"};
		System.out.println(student[rd.nextInt(student.length)]);
		}
		

	}

}
