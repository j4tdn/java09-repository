package polymorphism.object;

public class Square extends Shape {
	@Override
	void draw() {
		//super.draw();//goi den thang cha
		System.out.println(getClass().getSimpleName() + " ==> draw");//getSimpleName:tra ve Square
	}
}
