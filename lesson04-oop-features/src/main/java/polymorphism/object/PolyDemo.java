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

		// polymorphism : new object => intance
		// có thể gán các thể hiện của lớp cha cho nhau
		// design pattern: factory pattern
		Shape s1 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		s1.draw();

		Shape s2 = ShapeFactory.getShape(ShapeInstance.SQUARE);
		s2.draw();

	}
}
