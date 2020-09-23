package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Animal animal=new Cat();
		//Cat cat=new Cat();
		//System.out.println(animal.weight);
		//animal.drink();
		//cat.drink();
		
		
		//interface
		
		Father child= new Child();
		child.drinkBeer();
		
		//anonymous class
		Father parent =new Father() {
			public void playGame() {
				System.out.println(getClass().getSimpleName()+ "=> play game");
			}

			public void drinkBeer() {
				System.out.println(getClass().getSimpleName()+ "=> drink beeer");
				
			}
		};
		parent.drinkBeer();
				
	}
}
