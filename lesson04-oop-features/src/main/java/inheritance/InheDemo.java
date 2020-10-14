package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		// can not override attribute of super class
		Animal cat = new Cat();
		System.out.println("weight: " + cat.weight);
		cat.drink();

		// interface
		Father child = new Child();
		child.drinkBeer();
		child.playGame();

		// Anonymous class
		Father parent = new Father() {

			@Override
			public void playGame() {
				System.out.println("Play game");
			}

			@Override
			public void drinkBeer() {
				System.out.println("Drink beer 123");
			}

			@Override
			public void working() {
				System.out.println(" Working");
			}
		};
		parent.drinkBeer();
	}
}
