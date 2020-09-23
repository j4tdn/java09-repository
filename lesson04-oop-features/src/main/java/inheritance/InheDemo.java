package inheritance;

import inheritance.iinterface.Child;
import inheritance.iinterface.Father;

public class InheDemo {
	public static void main(String[] args) {
		Animal animal = new Cat();
		System.out.println("Weight:" + animal.weight);
		
		Animal cat = new Cat();
		System.out.println("weight:" + cat.weight);//weight van bang 50, vi chi thua ke method, ko thua ke thuoc tinh
		cat.drink();
		
		//interface
		Father child = new Child();
		child.drinkBeer();
		
		Father parent = new Father() {//parent la 1 tham chieu,tai thoi diem runtime se tro den Parent
			
			@Override
			public void playGame() {
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
