package util;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtil {
	private StringUtil() {
		// TODO Auto-generated constructor stub
	}
	public static String format(double money) {
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(money);
	}
	public static void hashCode(Object object) {
		System.out.println(System.identityHashCode(object));
	}
}
	
