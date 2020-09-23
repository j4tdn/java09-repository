package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		 Animal animal = new Cat();
		 System.out.println(animal.weight);
		 
		 //Interface
		 Father child = new Child();
		 child.drinkBeer();
		 
		 // anonymous class
		 Father parent = new Father() {
			public void playGame() {
				System.out.println("play game");
				
			}
			
			public void drinkBeer() {
				System.out.println("drink beer123");
			}

			public void working() {
				// TODO Auto-generated method stub
				
			}
		};
	    
		parent.drinkBeer();
	}
}
