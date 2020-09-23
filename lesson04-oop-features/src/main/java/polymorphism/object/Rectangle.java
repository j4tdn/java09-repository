package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println(getClass().getSimpleName() + " ==>draw");
	}
}
