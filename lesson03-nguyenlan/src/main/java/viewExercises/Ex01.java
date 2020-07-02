package viewExercises;

import exercises.Circle;
import exercises.Dot;

public class Ex01 {
	public static void main(String[] args) {
		Circle c1 = new Circle(0, 0, 2);
		Dot d1 = new Dot(0, 2);
		Dot d2 = new Dot(1, 2);
		System.out.println("d1 có thuộc đường tròn c1 hay không? => " + c1.isContain(d1));
		System.out.println("d2 có thuộc đường tròn c1 hay không? => " + c1.isContain(d2));
	}
}
