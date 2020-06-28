package utils;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {
	private StringUtils() {
	}
	
	public static String formatPrice(double price) {
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(price);
	}
}