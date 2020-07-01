package view;

import beans.PhoneAdv;

public class BuilderDemo {
	public static void main(String[] args) {
		PhoneAdv phone = PhoneAdv.builder().code("nhin cc").build();
		System.out.println(phone);
	}
}
