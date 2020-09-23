package polymorphism.object;

public class ShapeFactory {
	// place to create insrance
	public static Shape getShape(ShapeInstance instance) {
		Shape shape;
		switch (instance) {
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case SQUARE:
			shape = new Square();
			break;
		default:
			shape = new Shape();
			break;
		}
		return shape;
	}
}
