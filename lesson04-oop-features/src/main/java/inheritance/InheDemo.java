package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Animal cat = new Cat();
		System.out.println("weight :" + cat.weight);
		cat.drink();
		
		//interFace
		//anonymous class
		Father child = new Child();
		child.drinkBeer();
		
		Father parent = new Father() {
			
			@Override
			public void playGamme() {
				System.out.println("play game");
				
			}
			
			@Override
			public void drinkBeer() {
				System.out.println("drink beer 123");
				
			}
		};
		parent.drinkBeer();
	}
}
