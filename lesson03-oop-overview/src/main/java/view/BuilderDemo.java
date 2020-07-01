package view;

import beans.ItemAdv;
import beans.ItemAdv.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		ItemAdv first = ItemAdv.builder()
				.id("456")
				.color("red")
				.build();
		
		Builder builder = ItemAdv.builder()
				.id("123")
				.color("blue")
				.price(100);
		
				ItemAdv second = builder.build();
				ItemAdv third = builder.os("android").build();
		
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
