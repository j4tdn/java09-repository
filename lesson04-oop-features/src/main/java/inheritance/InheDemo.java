package inheritance;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Cat animal = new Cat();
		animal.setWeight(9999);
		System.out.println("weight: " + animal.weight);
		System.out.println(animal.getWeight());
		animal.printWeight();
		
		// inheritance
		Father parent = new Child();
		parent.drinkBeer();
		
		//interface
		// anonymous class
		Father p2 = new Father() {
			
			@Override
			public void playGame() {
				System.out.println("play game");
			}
			
			@Override
			public void drinkBeer() {
				System.out.println("drinkk beer 123");
			}

			@Override
			public void getAdn() {
				// TODO Auto-generated method stub
				
			}
		};
		
		p2.drinkBeer();
	}
}
