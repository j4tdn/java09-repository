package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Animal cat = new Cat();
		System.out.println("weight:" + cat.weight);
		cat.drink();
		// interface..........
		Father child = new Child();
		child.drinkBeer();
		Father parent = new Father() {

			@Override
			public void playGame() {
				System.out.println("playgame");

			}

			@Override
			public void drinkBeer() {
				System.out.println("drink beer123");
			}
		};
		parent.drinkBeer();
	}
}
