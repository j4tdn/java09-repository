package lesson02exercises;

// Bài 1: Viết chương trình nhập vào 3 số nguyên. Hãy in ba số này ra màn hình theo thứ tự tăng dần 

public class Bai01 {
	public static void main(String[] args) {
		int a = 5, b = 9, c = 8;
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (a > c) {
			temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
