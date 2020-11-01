package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class FormatNumber {
	public static void main(String[] args) {
		//Lam tron
		System.out.println("Lam tron tren: " + Math.round(5.7));
		System.out.println("Lam tron duoi: " + Math.floor(5.7));
		
		//Random
		Random rd = new Random();
		System.out.println("So random :" + rd.nextInt(10));
		System.out.println("So random trong khoang tu 5-20 : " + (5 + rd.nextInt(15)));
		
		//Format text: number,currency
		//Number format, decimal format
		float number = 450.123456f;
		BigDecimal b1 = BigDecimal.valueOf(number).setScale(5,RoundingMode.HALF_UP);
		System.out.println("b1:" + b1);
		
		//Number format
		int number1 = 123456;
		Locale locale = new Locale("vi","VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(number1));
	}
}
