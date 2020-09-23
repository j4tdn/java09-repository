package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Animal cat = new Cat();
		System.out.println("weight= " + cat.weight);
		cat.drink();
		// interface
		//anonymous class
		Father child = new Child();
		child.drinkBeer();
		Father parent = new Father() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("playGame");
				
			}
			
			@Override
			public void drinkBeer() {
				// TODO Auto-generated method stub
				System.out.println("drinkBeer123");
				
				
			}
		};
		parent.drinkBeer();
		

	}

}
