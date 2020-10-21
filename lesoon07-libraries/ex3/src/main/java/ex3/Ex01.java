package ex3;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("nhap a : ");
			int a = Integer.valueOf(sc.nextLine());
			System.out.println("nhap b : ");
			int b = Integer.valueOf(sc.nextLine());
			double result = -b/a;
			System.out.println("ket qua : "+ result);
		}
		catch (NumberFormatException e){
			System.out.println("vui long nhap so! ");
		}
		catch (ArithmeticException e) {
			System.out.println("a phai khac 0!");
		}

}
}
