package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		Rectangle rectangle = new Rectangle();
		rectangle.draw();

		Square square = new Square();
		square.draw();
		
		Shape s1= new Rectangle();
		s1.draw();
		
		Shape s2= new Square();
		s2.draw();
		
	//	s1=s2;
		
		//design pattern: factory pattern
		//Shape s3=ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		
	}
}
