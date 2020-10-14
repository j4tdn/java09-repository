package exception;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//write one method 
		//enter a, b
		//calculate a/b
		
		
		try {
			int result = doCalculate();
			System.out.println("return: " +result);
		} 
//		catch (NumberFormatException e1) {
//			System.out.println("E1: "+e1.getMessage());
//		}catch (ArithmeticException e2) {
//			System.out.println("E2: "+e2.getMessage());
//		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static int doCalculate() throws NumberFormatException, ArithmeticException{		//neu throws exception ben tren khong can try catch, deu la con runtime
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a");
		int a = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter b");
		int b = Integer.parseInt(ip.nextLine());
		
		return a/b;
	}
	

}
