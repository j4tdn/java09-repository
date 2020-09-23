package polymorphism.object;

public class ShapeFactory {
	//place to create shape instance
	
	public static Shape getShape(ShapeInstance instance) {
		Shape shape = null;
		switch (instance) {
		case Rectangle:
			shape = new Rectangle();
			break;
		case Square:
			shape = new Square();
			break;
		default:
			shape = new Shape();
			break;
		}
		return shape;
	}
}
