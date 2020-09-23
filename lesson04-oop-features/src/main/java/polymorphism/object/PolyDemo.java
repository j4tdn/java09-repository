package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.draw();
		
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		
		Square square = new Square();
		square.draw();
		
		//polymorphism: new Object => instance
		Shape s1 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		//Shape s1 = new Rectangle();
		s1.draw();
		
		Shape s2 = new Square();
		s2.draw();
		
		Rectangle s3 = (Rectangle) new Shape();
		s3.draw();
	}
}
