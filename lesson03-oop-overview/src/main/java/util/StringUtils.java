package util;

import java.text.NumberFormat;

import view.Locale;

public class StringUtils {
	private StringUtils() {
		
	}
	// call in to
	private static String format (double money) {
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN"))
	}
}
