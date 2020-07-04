package controller;

import model.Vehicle;

public class Controll {
	
	public static void main(String[] args) {
		
		Vehicle v1= new Vehicle();
		v1.setcC(500);
		v1.setOwner("Lam Duy1");
		v1.setPrice(6000000);
		v1.setType("HonDa");
		v1.thue();
		Vehicle v2= new Vehicle();
		v2.setcC(200);
		v2.setOwner("Lam Duy2");
		v2.setPrice(4658000);
		v2.setType("HonDa");
		v2.thue();
//		Vehicle v2= new Vehicle("Lam Duy2","HonDa",80,50000);
//		v2.thue();
		Vehicle v3= new Vehicle();
		v3.setcC(80);
		v3.setOwner("Lam Duy3");
		v3.setPrice(5421000);
		v3.setType("HonDa");
		v3.thue();
//		Vehicle v3= new Vehicle("Lam Duy3","HonDa",500,30000);
//		v3.thue();
		
		System.out.println("Chủ Xe"+"		"+"Loại"+"		"+"CC"+"		"+"Thuế"	);
		System.out.println("======================================================================");
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
	}

}
