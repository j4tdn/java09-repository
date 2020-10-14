package inheritance;

public class Cat extends Animal {
	int weight = 100;

	@Override
	void drink() {
		System.out.println(getClass().getSimpleName() + " drink");
	}
}
