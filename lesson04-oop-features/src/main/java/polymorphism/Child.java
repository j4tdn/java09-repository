package polymorphism;

public class Child extends Parent{

	@Override // annotation : định danh
	protected void playSport() {
		System.out.println(getClass().getName() + " playSport ..");
	}
	
}
