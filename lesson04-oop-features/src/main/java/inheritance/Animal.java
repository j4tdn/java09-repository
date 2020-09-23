package inheritance;

public class Animal {
	
	int weight = 50;
	
	void eat() {
		System.out.println(getClass().getSimpleName() + " ==> eat");
	};
	void drink() {
		System.out.println(getClass().getSimpleName() + " ==> drink");
	};
}
