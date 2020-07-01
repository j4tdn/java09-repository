package view;

import beans.ItemAdv;
import beans.ItemAdv.Builder;

public class BuiderDemo {
	public static void main(String[] args) {
		ItemAdv first = ItemAdv.builder().color("RED").deviceCode("123").build();
		Builder builder = ItemAdv.builder().deviceCode("123").color("red").price(400);
		ItemAdv second = builder.price(900).build();
		
		
		System.out.println(first);	
		System.out.println(second);
	}
}

