package polymorphism.method;

public class Child extends Parent{

	@Override
	protected void playSport() {
		System.out.println(getClass().getName()+"PlaySport..");
	}
	
}
