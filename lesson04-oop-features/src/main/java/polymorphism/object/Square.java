package polymorphism.object;

public class Square extends Shape {
	@Override
	void draw() {
		System.out.println(getClass().getSimpleName() + " draw");
	}
}
