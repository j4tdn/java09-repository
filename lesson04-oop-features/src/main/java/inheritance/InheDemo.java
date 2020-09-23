package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		
		//getClass().getSimpleName() instance name at runtime
		
		Cat cat = new Cat();
		System.out.println("weight:" + cat.weight);
		cat.drink();
		
		Animal cat2 = new Cat();
		System.out.println("weight:" + cat2.weight);
		cat2.drink();
		
		//interface
		
		Father child = new Child();
		child.drinkBeer();
		
		//anonymous class
		Father father = new Father() {
			
			@Override
			public void playGame() {
				System.out.println("play game");
			}
			
			@Override
			public void drinkBeer() {
				System.out.println("drink beer 123");
			}
		};
		father.drinkBeer();
	}
}
