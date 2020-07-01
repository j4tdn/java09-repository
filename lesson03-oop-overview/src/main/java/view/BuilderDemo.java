package view;

import beans.ItemAdv;
import beans.ItemAdv.Builder;

public class BuilderDemo {
	public static void main(String[] args) {
		ItemAdv first = ItemAdv.builder()
				.devId("123")
				.cost(50)
				.build();
		
		Builder builder = ItemAdv.builder()
				.devId("456")
				.cost(150)
				.color("green");
		
		ItemAdv second = builder
				.devId("456")
				.cost(150)
				.color("green")
				.build();
		
		ItemAdv third = builder
				.devId("456")
				.cost(150)
				.color("green")
				.operateSystem("android")
				.build();
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
