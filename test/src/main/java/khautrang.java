import java.util.Arrays;
import java.util.Scanner;

public class khautrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		int a, b, l, k;
		int m, n, p, q, r;
		Scanner scanner = new Scanner(System.in);
		length = scanner.nextInt();
		int arr[] = new int[length];
		int result[] = new int[5];
		int index = 0;
		for (int i = 0; i < length; i++) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			l = scanner.nextInt();
			k = scanner.nextInt();
			n = scanner.nextInt();
			m = scanner.nextInt();
			p = scanner.nextInt();
			q = scanner.nextInt();
			r = scanner.nextInt();
			result[0] = n / (2 * b);
			result[1] = m / b;
			result[2] = p / b;
			result[3] = q / (l);
			result[4] = r / k;
			Arrays.sort(result);
//			for (int i : result) {
//				System.out.println(i);
//			}
			arr[index] = result[0];
			index++;
		}
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
