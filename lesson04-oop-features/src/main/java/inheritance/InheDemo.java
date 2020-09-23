package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Animal cat = new Cat();
		System.out.println("weight: " + cat.weight);
		cat.drink();
		
		//interface
		Father parent = new Child();
		parent.drinkBeer();
		
		
	}
}
