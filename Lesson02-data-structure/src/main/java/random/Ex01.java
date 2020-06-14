package random;

import java.util.Random;

public class Ex01 {
public static void main(String[] args) {
	Random rd  = new Random();
	int number =20+rd.nextInt(6);//20->25
	//a-b=a+nextInt (b-a+1);
	System.out.println("number"+number);
	String [] students= {"nam","teo","hoang"};
	System.out.println(students[rd.nextInt(students.length)]);
	
}
}
