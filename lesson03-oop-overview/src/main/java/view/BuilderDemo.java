package view;

import beans.DevicesAdvange;
import beans.DevicesAdvange.Builder;

public class BuilderDemo {
public static void main(String[] args) {
	DevicesAdvange first = DevicesAdvange.builder()
											.id("123")
											.color("blue")
											.price(600)
											.build();
	Builder builder = DevicesAdvange.builder()
			.id("456")
			.color("black")
			.price(200);
	DevicesAdvange second = builder.build();
	DevicesAdvange third = builder.os("android").build();
	
	System.out.println(first);
	System.out.println(third);
}
}
