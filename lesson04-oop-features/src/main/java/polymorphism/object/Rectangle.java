package polymorphism.object;

public class Rectangle extends Shape {
@Override
void draw() {
	
	System.out.println(getClass().getSimpleName()+ "==> draw");//gọi đến hàm mà class được trỏ đến.
}
}
