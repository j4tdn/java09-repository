package polymorphism.object;

public class Shape {
	void draw() {
		System.out.println(getClass().getSimpleName() + " ==> draw");
	}

	private void show() {
		System.out.println("private");
	}

	public void callPrivateMethod() {

		show();
	}
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.show();
	}
}
