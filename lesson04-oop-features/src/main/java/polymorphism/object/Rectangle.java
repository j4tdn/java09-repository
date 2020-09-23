package polymorphism.object;

public class Rectangle extends Shape {
	@Override
	void draw() {
		//super.draw();//goi den thang cha
		System.out.println(getClass().getSimpleName() + " ==> draw");//getSimpleName:tra ve Rectangle
	}
}
