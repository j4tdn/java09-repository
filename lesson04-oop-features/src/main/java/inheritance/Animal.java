package inheritance;

public class Animal {
	int weight = 50;

	public int getWeight() {
		return this.weight;
	}
	
	public void printWeight() {
		System.out.println(weight);
	}
	
	
	void eat() {
		System.out.println(getClass().getSimpleName() + "==> eat");
	}
	
	void drink() {
		System.out.println(getClass().getSimpleName() + "==> drink");
	}
}
