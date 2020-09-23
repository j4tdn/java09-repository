package polymorphism.object;

public class ShapeFactory {
	// place to create shpe instance
	public static Shape getShape(ShapeInstance instance) {
		switch (instance) {
		Shape shape = null;
		case RECTANGLE:
			shape = new Rectangle();
			
			break;
		case SQUARE:
			shape = new Square();
			
			break;

		default:
			break;
		
		
	}

}
}
