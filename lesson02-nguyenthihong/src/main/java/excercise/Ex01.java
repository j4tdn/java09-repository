package excercise;

public class Ex01 {
//Viết chương trình nhập vào ba số nguyên. Hãy in ba số này ra màn hình
//	theo thứ tự tăng dần và chỉ dùng tối đa một biến phụ
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 2;
		int tmp;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		if (a > c) {
			tmp = a;
			a = c;
			c = tmp;
		}

		if (b > c) {
			tmp = b;
			b = c;
			c = tmp;
		}
		System.out.println(a + "," + b + "," + c);
	}
}
