package view;

import beans.Car;

public class CarDemo {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setId("1234"); 
		c1.setColor("blue");
		c1.setModel("audi");
		//
		c1.setCapacity(5);
		c1.setCurrentPassengers(2);

		Car c2 = new Car("2004", "black", "huynhdai", 8);
		c2.setCurrentPassengers(5);

		c1.transfer(c2, 1);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println("=====================");
		//getter
		System.out.println("c1 model: " + c1.getModel());
	}
}
