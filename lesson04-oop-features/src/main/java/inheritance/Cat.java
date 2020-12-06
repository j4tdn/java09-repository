package inheritance;

public class Cat extends Animal {
	// getClass().getSimpleName(): instance name at runtime
	
	int weight = 100;

	@Override
	void drink() {
		System.out.println(getClass().getSimpleName() + " => drink");
	}

}
