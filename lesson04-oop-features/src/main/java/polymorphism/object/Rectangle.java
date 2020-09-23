package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void draw() {
		// TODO Auto-generated method stub
		super.draw();
		System.out.println(getClass().getSimpleName() + "==> draw");
	}
}
