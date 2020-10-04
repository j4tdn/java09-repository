package beanTest;

import beanTest.itemAdv.Builder;
import static beanTest.itemAdv.builder;

public class demo {
	public static void main(String[] args) {
		itemAdv b = builder()
				.id("4")
				.name("Sang")
				.build();
		
		System.out.println(b.getId());
		
	}
	
}
