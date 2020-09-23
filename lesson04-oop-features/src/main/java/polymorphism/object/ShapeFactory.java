package polymorphism.object;

public class ShapeFactory {
	//place to create shaoe instance
	public static Shape getShape (ShapeInstance key) {
		Shape shape = null;
		switch (key) {
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
