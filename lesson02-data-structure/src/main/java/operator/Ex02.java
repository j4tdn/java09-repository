package operator;

public class Ex02 {
	public static void main(String[] args) {
		int x = 2, y = 4, z = 3;
		y = y + ++x - y-- + z + --y - --z + x--;
		System.out.println("x: " + x + "\ny: " + y + "\nz: " + z);
	}

}
