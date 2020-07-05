package homework_01;

public class Main {
	public static void main(String[] args) {
		Circle c = new Circle(0, 0, 6);
		Point p1 = new Point(0, 5);
		Point p2 = new Point(2, 3);
		if (c.check(p1) == true) {
			System.out.println("thuoc duong tron");
		} else {
			System.out.println("ko thuoc duong tron");
		}

		if (c.check(p2) == true) {
			System.out.println(" thuoc duong tron");
		} else {
			System.out.println("ko thuoc duong tron");
		}
	}
}