package controller;

public class Ex04LoopAndBreakContinue {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			} // break: 1,2 continue 1,2,4,5
			System.out.println(i);
		}
	}

}
