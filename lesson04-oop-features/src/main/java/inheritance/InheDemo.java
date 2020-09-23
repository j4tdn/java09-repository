package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		// chỉ có phương thức mới override còn thuộc tính thì không được override
		Animal animal = new Cat();
		System.out.println("weight :" + animal.weight);
		Animal cat = new Cat();
		cat.drink();
		// interface
		//anonymous class
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
