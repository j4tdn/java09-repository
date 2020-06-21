package controller;

import java.util.Random;

public class Ex02Operator {
	public static void main(String[] args) {
		int number=new Random().nextInt(10);
		System.out.println(number%2==0?"even":"odd");
		
	}
	private static int Max(int a,int b,int c) {
		return (a>b?a:b)>c?(a>b?a:b):c;
	}
}
