package view;

import beans.PhoneAdv;
import beans.PhoneAdv.Builder;

public class BuiderDemo {
	public static void main(String[] args) {
		PhoneAdv phone = PhoneAdv.builder().id("123").color("red").build();
		System.out.println(phone);

		PhoneAdv phone_1 = PhoneAdv.builder().id("234").color("blue").price(400).build();
		System.out.println(phone_1);

		Builder builder = PhoneAdv.builder().id("456").color("green");
		PhoneAdv phone_2 = builder.price(500).build();
		System.out.println(phone_2);

	}
}
