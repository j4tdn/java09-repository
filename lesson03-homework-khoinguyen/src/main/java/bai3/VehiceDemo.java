package bai3;

import bai3.Vehice;

public class VehiceDemo {
	public static void main(String[] args) {
		Vehice v1 = new Vehice("Nguyen Thi Thu Loan", "Futer Neo", 100, 3500000);
		Vehice v2 = new Vehice("Le Minh Tinh ", "Ford Ranger", 3000, 25000000);
		Vehice v3 = new Vehice("Nguyen Minh Triet", "Landscape", 15000, 100000000);
		System.out.println(v1+" " + "thue xe 1 :"+v1.getThue());
		System.out.println(v2 + " " + "thue xe 2 :"+ v2.getThue());
		System.out.println(v3 + " " + "thue xe 3 :"+v3.getThue());
		//System.out.println("thue xe1:"+v1.getThue());
		//System.out.println("thue xe2:"+v2.getThue());
		//System.out.println("thue xe3:"+v3.getThue());
		
	}

}
