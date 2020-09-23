package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		// Shape, Rectangle, Square
		Shape shape = new Shape();
		shape.draw();
		
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		
		Square square = new Square();
		square.draw();
		
		// polimorphism
		Shape s1 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		s1.draw();
		
		Shape s2 = new Square();
		s2.draw();
	}
}
