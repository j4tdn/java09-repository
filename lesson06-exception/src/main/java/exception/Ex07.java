package exception;

import java.util.Scanner;

public class Ex07 {
	//write one method
		//1 enter 2 digit a,b
		//2 calculate a/b
	public static void main(String[] args) {
		
		try {
			int result = doCal();
			System.out.println("result: " + result);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	

}
private static int doCal() throws Exception{
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter a: ");
	int a = Integer.parseInt(ip.nextLine());
	System.out.println("Enter b: ");
	int b = Integer.parseInt(ip.nextLine());
	return a/b;

	
}
}
