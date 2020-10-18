package exercises;

import java.io.IOException;

public class test {
	public static void main(String[] args) {
//		try {
//			check();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("Done");
//		check();
		
		
//		try {
//			int a = 10/1;
//			try {
//				Integer.parseInt("a");
//			} catch (ArithmeticException e) {
//				System.out.println("A");
//			}
//		} catch (NumberFormatException e) {
//			System.out.println("B");
//		}
		
		
//		try {
//			Integer.parseInt("a");
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		} catch (Exception e) {
//			// TODO: handle exception
////			System.out.println(e.getMessage());
//		}
//		
//		try {
//			
//		} catch (NumberFormatException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage()+" second" );
//		}
		
		
		try {
			int a = 1/0;
			System.out.println("Done Try");
		} catch (Exception e) {
			System.out.println("Done Exception");
			// TODO: handle exception
		}
		System.out.println("Done");
	}
	
	private static void check()  {
		if(false) {
			throw new RuntimeException("A");
		}
		
//		if(false) {
//			throw new IOException("B");
//		}
		System.out.println("Done Exception");
	}
}
