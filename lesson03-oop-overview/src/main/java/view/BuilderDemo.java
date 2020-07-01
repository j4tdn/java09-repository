package view;

import beans.ItemAdv;
import beans.ItemAdv.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		ItemAdv first = ItemAdv.builder()
				.id("123")
				.color("red")
				.build();
		ItemAdv second = ItemAdv.builder()
				.id("123")
				.color("red")
				.price(100)
				.build();
		Builder builder = ItemAdv.builder().id("122").color("pin").price(120);
		ItemAdv h = builder.build();
		ItemAdv  third = builder.os("addr").build();
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(h);
		
		
		// dtring
		
	}
}
