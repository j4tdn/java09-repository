package view;

import beans.ItemAdv;
import beans.ItemAdv.Builder;


public class BuilderDemo {	
	public static void main(String[] args) {
		ItemAdv first= ItemAdv.builder().id("123").color("blue").cost(500).build();
		ItemAdv second= ItemAdv.builder().id("123").color("blue").build();
		Builder builder = ItemAdv.builder().id("123").color("blue");
	ItemAdv third = builder.system("ios").build();
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
