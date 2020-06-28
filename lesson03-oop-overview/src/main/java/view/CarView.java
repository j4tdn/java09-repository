package view;

import beans.Car;

public class CarView {
	public static void main(String[] args) {
		final Car c1=new Car(); //restrict garbage in heap
		c1.setId("123abc");
		c1.setColor("green");
		c1.setModel("benz");
		//c1.currentAmountOfPeople=2;
		c1.setCapacity(8);
		c1.setCurrentPassengers(3);
		//c1.setCapacity(8);
		
		//Car c2=new Car("456","organe","lambo",8);
		//c2.currentPassengers=3;
		//System.out.println(c1);
		System.out.println(c1);
		
		
		System.out.println("==============");
		//getter
		System.out.println("c1 model:  "+ c1.getModel());
	}
}
