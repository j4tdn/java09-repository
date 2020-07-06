package polymorphism;

public class Child extends Parent {

	@Override//annotation
	protected void playSport() {
		System.out.println(getClass().getName()+ "playSport ....");
		
		//super.playSport(); // super laf 1 doi tuong(giong nhu this) nhung dai dien cho phuong thuc cha
	}
	
}