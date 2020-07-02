package view;


import beans.ItemAdv;
import beans.ItemAdv.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		ItemAdv firt= ItemAdv.builder().id("123").color("red").os("IOS").build();
		ItemAdv secon= ItemAdv.builder().id("123").os("IOS").price(1000).build();
		
		Builder builder=ItemAdv.builder().id("123").color("red");
		
		ItemAdv third=builder.build();
		

		System.out.println(firt);
		System.out.println(secon);
		System.out.println(third);

	}
}
