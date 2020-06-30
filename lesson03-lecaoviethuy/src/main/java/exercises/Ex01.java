package exercises;

import entities.Circle;

public class Ex01 {
	public static void main(String[] args) {
		Circle circle = new Circle(0d, 0d, 5d);
		if(circle.isContain(3.3d, 4.6d)) {
			System.out.println("Có thuộc đường tròn");
		} else {
			System.out.println("Không thuộc đường tròn");
		}
	}
}
