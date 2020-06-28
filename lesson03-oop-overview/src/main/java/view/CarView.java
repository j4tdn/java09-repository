package view;

import beans.Car;

public class CarView {
	public static void main(String[] args) {
		final Car c1 = new Car("123abc", "Green", "Lamborghini", 7); // restrict garbage in heap memory
		c1.setCurrentPassengers(6);

		Car c2 = new Car("456xyz", "Black", "Porsche", 9);
		c2.setCurrentPassengers(3);
		c1.transfer(c2, 1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("====================");
		// getter
		System.out.println("c1 model: " + c1.getModel());
	}

}
