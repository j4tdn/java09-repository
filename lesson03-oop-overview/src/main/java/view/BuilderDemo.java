package view;

import beans.PhoneAdv;
import beans.PhoneAdv.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		PhoneAdv first = PhoneAdv.builder()
			.id("123")
			.color("blue")
			.build();
		
		Builder builder = PhoneAdv.builder()
				.id("123")
				.color("red")
				.price(100d);
		PhoneAdv second = builder.build();

		PhoneAdv third = builder.system("android").build();
		
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		
	}
}
