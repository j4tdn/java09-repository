package utils;

import java.text.NumberFormat;

public class StringUtils {
	private StringUtils() {
		
	}
	//todo
	public static String format(double money) {
		return NumberFormat.getCurrencyInstance().format(money);

	}
}
