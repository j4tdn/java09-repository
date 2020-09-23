package polymorphism.object;

public class ShapeFactory {
	public static Shape getShape(ShapeInstance instance) {
		Shape shape;
		switch (instance) {
		case RECTANGLE:
			shape = new Rectangle();
			break;
		case SQUARE:
			shape = new Shape();
			break;
		default:
			shape = new Shape();
			break;
		}
		return shape;
	}
}
