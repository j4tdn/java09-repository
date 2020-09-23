package polymorphism.object;

public class PolyDemo {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Rectangle ractangle = new Rectangle();
		ractangle.draw();
		
		Square square = new Square();
		square.draw();
		
		Shape s1 = ShapeFactory.getShape(ShapeInstance.Rectangle);
		s1.draw();
		
		Shape s2 = new Square();
		s2.draw();
		
	}
}
