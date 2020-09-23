package polymorphism.object;

public class PolyDemo {
		public static void main(String[] args) {
			//shape rectangle square 
			Shape  shape = new Shape();
			shape.draw();
			Rectangle rectangle = new Rectangle();
			rectangle.draw();
			Square square = new Square();
			square.draw();
			System.out.println("==================");
			// polymorphidm : new Object +> instance
			Shape s1 = new Rectangle();
			s1.draw();
			Shape s2 = new Square();
			s2.draw();
			s1 =s2 ;
		}
}
