package polymorphism.object;

public class ShapeFactory {
	//place to create shape instance // noi tao cac the hien cua shape
	public static Shape getShape(ShapeInstance instance) {
		Shape shape = null;
		
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
