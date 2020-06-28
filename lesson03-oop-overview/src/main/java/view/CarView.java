package view;

import beans.Car;

public class CarView {
	public static void main(String[] args) {
		final Car c1 = new Car();
		c1.setId("123");
		c1.setColor("black");
		c1.setModel("benz");
		c1.setCapacity(8);
		c1.setCurrentPassengers(6);

		Car c2 = new Car("456", "while", "lambo", 8);
		c2.setPassengers(5);
		c1.transfer(c2, 2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("===========");
		//getter
		System.out.println("c1 model:"+c1.getModel());
	}
}
