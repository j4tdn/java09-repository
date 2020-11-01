package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(Math.ceil(5.4));
		
		Random rd = new Random();
		System.out.println("rand 01: " + rd.nextInt(10));

		// random 5 -> 20
		System.out.println("rand 02: " + (5 + rd.nextInt(16)));
		
		// format text: number, currency
		// number format, decimal format
		float number = 45643.432553545f;
		System.out.println("number: " + number);
		
		BigDecimal b1 = BigDecimal.valueOf(number).setScale(5, RoundingMode.HALF_UP);
		System.out.println("formatted number: " + b1.doubleValue());
		
		int number2 = 55678;
		Locale locale = new Locale("vi", "VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		System.out.println(numberFormat.format(number2));
	}
}
