package polymorphism.method;

public class Child extends Parent {
	@Override // annotation

	protected void playSport() {
		System.out.println(getClass().getName() + "playSport...");
	}

}
