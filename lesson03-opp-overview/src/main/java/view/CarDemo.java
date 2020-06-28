package view;

import beans.Car;

public class CarDemo {
	
	public static void main(String[] args) {
		final Car c1 = new Car();//hạn chế rác trên heap
		c1.setId("123abc")  ;
		c1.setColor ("green");
		c1.setModel ( "benz");
		c1.setCapacity (1);
		c1.setCurentPassenger(6);
		Car c2 = new Car("456xyz", "yellow", "lambo", 8);
		//c2.setCurentPassenger (3);
		c1.transfer(c2, 100);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("===========================");
		//getter
		System.out.println("c1 model: "+c1.getModel());

	}
}
