package view;

import beans.car;

public class CarVIew {
	public static void main(String[] args) {
		car c1 = new car();
		c1.setId("123abc");
		c1.setColor("green");
		c1.setModel("benz");

		c1.setCapacity(8);
		c1.setCurrentPassengers(6);

		car c2 = new car("456xyz", "orange", "lambo", 8);
		c2.setCurrentPassengers(3);

		c1.transfer(c2, 1);

		System.out.println("id : " + c1);// mac dinh khi in ra c1, han se in ra c1.toString() cua class object
		// nhung ma bay h minh da tao ham toString cua lop car nen han se goi ra ham
		// string cua lop car
		System.out.println("id : " + c2);
		
		System.out.println("==============================");
		//getter
		System.out.println("c1 model :" + c1.getModel());
	}
}
