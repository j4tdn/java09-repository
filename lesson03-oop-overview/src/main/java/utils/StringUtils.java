package utils;

import java.text.NumberFormat;

public class StringUtils {
	private StringUtils() {
		
	}
	public static void hashCode(Object object) {
		System.out.println(System.identityHashCode(object));
	}
	//todo
	public static String format(double money) {
		return NumberFormat.getCurrencyInstance().format(money);

	}
}
