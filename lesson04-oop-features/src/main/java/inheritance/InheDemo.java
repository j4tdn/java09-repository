package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		// cat: w=100
		// animal: w=50
		
		Animal cat = new Cat();
		System.out.println("weight: " + cat.weight);
		cat.drink();
		
		// interface
		// anonymous class
		Father child = new Child();
		child.drinkBeer();
		
		Father parent = new Father() {
			
			public void playGame() {
				System.out.println("play game");
				
			}
			
			public void drinkBeer() {
				System.out.println("drink beer 123");
				
			}
		};
		
		parent.drinkBeer();
		
		
		
	}
}
