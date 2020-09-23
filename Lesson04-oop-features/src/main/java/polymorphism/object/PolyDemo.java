package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		Shape shape=new Shape();
		shape.draw();
		
		Rectangle rectangle=new Rectangle();
		rectangle.draw();
		
		Square square = new Square();
		square.draw();
		
		
		System.out.println("====");
		//polymorphism- da hinh.new object=> instance
		Shape s1= new ShapeFactory().getShape(ShapeInstance.RECTANGLE);
		s1.draw();
		Shape s2= new Square();
		s2.draw();
		
	}
}
