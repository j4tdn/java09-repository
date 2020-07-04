package controller;

import Bai3.Vehicle;

public class VehicleDemo {

	public static void main(String[] args) {
		VehicleDemo a= new VehicleDemo();
		Vehicle v1 = new Vehicle("Nguyen Thu Loan","Future Neo",100,35000000);
		Vehicle v2= new Vehicle("Le Minh Tinh", "Ford Ranger",3000,125000000);
		Vehicle v3 =new Vehicle("Nguyen Minh Triet", "Landscape", 1500,500000000);
		System.out.println("Ten chu xe"+"   Loai xe" + "   Dung tich" + "   Tri gia" + "   Thue" );

		//System.out.printf( %30l", v1, v1.getThue());
		//System.out.println();
		//System.out.printf("%s %30s", "helloaaaa5363333", "hallo");
		System.out.println(v2 +"   "+ v1.getThue());
		System.out.println(v2 +"   "+ v2.getThue());
		System.out.println(v3 +"   "+ v3.getThue());
		
	}

}
