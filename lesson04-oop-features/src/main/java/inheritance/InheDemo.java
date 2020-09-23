package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Cat animal = new Cat();
		System.out.println("Weight: " + animal.weight);
		animal.drink();
		
		//interface
		//anonymous class
		Father child = new Child();
		child.drinkBeer();
		
		Father parent = new Father() {
			
			public void playGame() {
				System.out.println("play game");
			}
			
			public void drinkBeer() {
				System.out.println("drinkBeer");
			}
		};
		parent.drinkBeer();
	}
}
