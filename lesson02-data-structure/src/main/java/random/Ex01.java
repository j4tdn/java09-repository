package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		Random rd=new Random();
		int number =20+ rd.nextInt(6);
		System.out.println("number :"+number);
		
		String[] students = {"Nam", "Teo", "Hoang"};	
		System.out.println(students[rd.nextInt(students.length)]);
	}
}
