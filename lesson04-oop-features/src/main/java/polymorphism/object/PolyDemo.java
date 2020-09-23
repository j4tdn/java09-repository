package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		// shape
		// rec
		// square
		Shape shape = new Shape();
		shape.draw();

		Rectangle rectangle = new Rectangle();
		rectangle.draw();

		Square square = new Square();
		square.draw();

		// polymorphism: new Object Instance
		//design pattern : factory pattern
		Shape s1 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		s1.draw();
		Shape s2 = new Square();
		s2.draw();
		s1 = s2;

	}
}
