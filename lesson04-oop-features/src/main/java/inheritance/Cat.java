package inheritance;

public class Cat extends Animal {
	int weight = 50;
	@Override
	void drink() {
		System.out.println(getClass().getSimpleName()+ "==> drink");
	}
}
