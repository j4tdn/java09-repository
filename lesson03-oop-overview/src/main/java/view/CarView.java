package view;

import beans.Car;

public class CarView {
	public static void main(String[] args) {
		final Car c1 = new Car("nxcd12", "green", "mercedes", 9);
		final Car c2 = new Car("123jgf", "red", "lamboghini", 20);
		
		c1.setCurrentPassenger(4);
		c2.setCurrentPassenger(7);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("================");
		System.out.println("c1 model: " + c1.getModel());
	}
}