package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();

		Rectangle rectangle = new Rectangle();
		rectangle.draw();

		Square square = new Square();
		square.draw();
		System.out.println("=======================================");
		
		//da hinh
		Shape s1 = ShapeFactory.getShape(ShapeInstance.RECTANGLE);
		s1.draw();//Rectangle
		
		Shape s2 = new Square();
		s2.draw();
		
		//error
		Rectangle s3 = (Rectangle) new Shape();
		//s3.draw(); //error
	}
}