import java.util.Random;

public class Bai07 {

	public static void main(String[] args) {
		int[] a = new int[5];
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			boolean trung = false;
			while (!trung) {
				trung=true;
				a[i] = 20 + rd.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (a[i] == a[j]) {
						trung = false;
						break;
					}
				}
				
						
			}
			System.out.print(a[i] + " ");
		}

	}
}