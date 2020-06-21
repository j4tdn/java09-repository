package controller;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		// int number =new Random().nextInt(10);
		// System.out.print("number :" + number);
		// System.out.println(number % 2 == 0 ? "Even" : "Old");
	}
	private static int max (int a ,int b, int c) {
		int max =  a > b ? a : b ;
		return max > c ? max : c;	
		}
		
	}
