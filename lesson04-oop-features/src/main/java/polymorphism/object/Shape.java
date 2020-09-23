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
}
