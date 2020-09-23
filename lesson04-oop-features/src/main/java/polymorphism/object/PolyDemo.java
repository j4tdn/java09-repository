package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		
		Square square = new Square();
		square.draw();
		
		//polymorphism
		Shape s1 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		s1.draw();
		
	}
}
