package outside;

import polymorphism.Parent;

public class Child extends Parent {
	@Override
	protected void drinkBeer() {
		System.out.println("Bố uống bia mạnh, thì con còn uống mạnh hơn <3");
	}
}
