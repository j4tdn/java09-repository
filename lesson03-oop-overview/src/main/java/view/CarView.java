package view;

import beans.Car;

public class CarView {

	public static void main(String[] args) {
		// Iteger a = new integer(5) a la tham chieu
		final Car c1 = new Car(); 		//restrict garbage in heap
		c1.setId("123abc");
		c1.setColor("green") ;
		c1.setModel("benz");
		c1.setCapacity(0);
		c1.setPassenger(6);

		c1.currentPassenger = 6;
		System.out.println(c1);

		Car c2 = new Car("456xyz", "orange", "lambo", 8);
		c2.currentPassenger = 3;
		c1.transfer(c2, 1);
		c1.setPassenger(6);

		System.out.println(c2);
		
		System.out.println("============");
		//getter
		System.out.println("c1 model: " + c1.getModel());

	}

}


