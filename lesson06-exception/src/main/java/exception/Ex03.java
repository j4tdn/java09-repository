package exception;

import java.util.Scanner;

public class Ex03 {
				public static void main(String[] args) {
					do {
						try {
							int a = inputNumbers();
							System.out.println("a: "+a);
							break;
						} catch (Exception e) {		
							
						}
						
					} while (true);
					
					int b = inputNumbers();
					int c=inputNumbers();
					
				}
				
				
			
			private static int inputNumbers() throws NumberFormatException {
				Scanner ip = new Scanner(System.in);
				System.out.println("enter number: ");
				return	Integer.parseInt(ip.nextLine());
						
					
			}
}
