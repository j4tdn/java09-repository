package utils;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtils {
	public static void hashCode(Object object) {
		System.out.println(System.identityHashCode(object));
	}
	public static String format(double money) {
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(money);
	}
}
