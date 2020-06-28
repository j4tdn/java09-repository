package view;

import beans.Car;

public class CarView {
	public static void main(String[] args) {
		// Integer a = new Integer(5);

		final Car c1 = new Car(); // restruct garbage in head
		c1.setId("abc");
		c1.setColor("green");
		c1.setModel("benz");
		c1.setCapacity(8);
		c1.setCurrentPassengers(3);

		Car c2 = new Car("456xyz", "orrange", "lambo", 8);
		c2.setCurrentPassengers(6);

		c1.transfer(c2, 100);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println("=================");
		//getter
		System.out.println("c1 model : " + c1.getModel());
	}
}
