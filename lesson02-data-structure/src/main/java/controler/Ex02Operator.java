package controler;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		maximum(8, 10, 15);
		//int number= new Random().nextInt(10);
		//System.out.println(number);
		//System.out.println(number%2==0 ? "Even" : "Odd");
	}
	private static int maximum(int a ,int b,int c) {
		int max= a>b ? a : b ;
		return max > c ? max :c;
		
		
		
	}
}

