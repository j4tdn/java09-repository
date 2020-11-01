package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		//Math libraries
		System.out.println( Math.round(5.7));
		System.out.println(Math.floor(5.7));
		
		// Random
		Random rd = new Random();
		// 0 => n-1 
		System.out.println("rand 01: " + rd.nextInt(10));
		
		//a - b:  5 => 20
		
		System.out.println("rand 02: " + (5 + rd.nextInt(16)));
		
		// format text: number, currency
		//number format decimal format
		
		//commercial round
		float number =809238.8383f;
		DecimalFormat formatter = new DecimalFormat("#,###.#####");
		//System.out.println("number : " + formatter.format(number));
		
		//format: until a limit number
		
		BigDecimal b1 = BigDecimal.valueOf(number).setScale(5, RoundingMode.HALF_UP);;
		System.out.println("b1: " + b1);
		
		//number format
		int number1 = 5698;
		Locale locale = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(number1));
		
		
		
	}
}
