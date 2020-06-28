package view;

import beans.Car;

public class CarView {
	public static void main(String[] args) {
		final Car c1 = new Car("123", "green", "benz", 29);
		c1.setCurrentPassengers(6);

		final Car c2 = new Car("456", "yellow", "bmw", 19);
		c2.setCurrentPassengers(3);

		System.out.println(c1.transfer(c2, 1));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("=====");
		System.out.println("c1 model: " + c1.getModel());

	}
}
