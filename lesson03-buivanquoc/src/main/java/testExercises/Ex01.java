package testExercises;

import exercises.Circle;

public class Ex01 {
	public static void main(String[] args) {
		Circle circle = new Circle(0, 0, 4);
		if (circle.isContain(3, 4))
			System.out.println("thuoc duong tron");
		else
			System.out.println("khong thuoc duong tron");
	}
}
