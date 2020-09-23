package polymorphism.method;

public class Child extends Parent {
	@Override
	protected void drinkBeer() {
		System.out.println("Bố uống bia mạnh, thì con còn uống mạnh hơn <3");
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.drinkBeer();
	}
}
