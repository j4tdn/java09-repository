package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
		public static void main(String[] args) {
			Animal cat = new Cat();
			System.out.println("weight: "+cat.weigt);
		cat.drink();
		// interface
		// anony
		Father child = new Child();
		child.drinkBeer();
		
		Father parent = new Father() {
			
			@Override
			public void playgame() {
				System.out.println("playgame");
			}
			
			@Override
			public void drinkBeer() {
				System.out.println("  drinbeer");
				
			}
		};
		parent.drinkBeer();
		}
	
		
}
