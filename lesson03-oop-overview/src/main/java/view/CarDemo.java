package view;

import beans.Car;

public class CarDemo {
	public static void main(String[] args) {
		Integer a = new Integer(5);
		final Car c1 = new Car();//restrict garbage in heap
		c1.setID("123abc");
		c1.setColor("green");
		c1.setModel("benz");
		//catch error for capacity
		c1.setCapasity(6);
		c1.setCurrentPassengers(2);

		System.out.println(c1);

		Car c2 = new Car("456xyz", "yellow", "lambo", 4);
		c2.setCurrentPassengers(2);
		System.out.println(c2);

		c1.transfer(c2, 2);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println("=================");
		
		//getter
		System.out.println("c1 model: "+c1.getModel());
	}
}
