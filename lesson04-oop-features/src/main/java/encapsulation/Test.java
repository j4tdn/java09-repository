package encapsulation;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		//ClassTest cl = new ClassTest();
		ClassTest.printSomething();
		System.out.println(sum(1,2));
	}
	
	private static int sum(int a,int b) { //phai co static thi ham main ms goi dc
		return a + b;
	}
}

