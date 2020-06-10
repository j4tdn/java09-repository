package main;

public class Ex01MainMethod {
	public static void main(String[] args) {
		System.out.println("Welcome !!!");
		main();
	
	}
	
	public void method() {
		main();
	}
	
	public static void main() {
		System.out.println("Second main !!!");
	}
}
