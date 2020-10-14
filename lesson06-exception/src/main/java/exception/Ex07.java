
package exception;

import java.util.Scanner;

public class Ex07 {
			public static void main(String[] args) {
				try {
					int result = doCalculation();
					System.out.println("result: "+ result);
				} catch (NumberFormatException e1) {
					System.out.println("e1: "+ e1.getMessage());
				}
					
				 catch (ArithmeticException e2) {
					System.out.println("e2: "+ e2.getMessage());
				}
			}
			
			private static int doCalculation() throws NumberFormatException, ArithmeticException {
				Scanner ip = new Scanner(System.in);
				System.out.println("enter a: ");
				int a = Integer.parseInt(ip.nextLine());
						System.out.println("enter b: ");
				int b =Integer.parseInt(ip.nextLine());
				return a/b;
			}
}
