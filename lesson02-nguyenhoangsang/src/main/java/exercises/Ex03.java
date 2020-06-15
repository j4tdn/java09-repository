package exercises;

public class Ex03 {
	public static void main(String[] args) {
		kiemTraSDX(1234);
	}

	public static void kiemTraSDX(int n) {
		int soNghichDao = 0;
		int t = n;
		int length = kiemTraDoDai(n);

		for (int i = 0; i < length; i++) {
			int m = n % 10;
			soNghichDao += m * Math.pow(10, (length - i) - 1);
			n = n / 10;
		}
		if (soNghichDao == t) {
			System.out.println(t + " la so doi xung !");
		} else {
			System.out.println(t + " khong phai la so doi xung !");
		}

	}

	public static int kiemTraDoDai(int x) {
		int length = 0;
		while (true) {
			x = x / 10;
			if (x == 0) {
				break;
			}
			length++;
		}
		return length + 1;
	}
}
