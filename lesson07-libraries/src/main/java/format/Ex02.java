package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println(Math.round(5.7));
		System.out.println(Math.floor(5.7));
		
		//random
		Random rd = new Random();
		
		//0->n-1
		System.out.println("rand 01: " + rd.nextInt(10));
		
		//a->b
		//5->20
		System.out.println("rand a-b: "+ (5 + rd.nextInt(16)));
		
		//format text: number, currency
		//number format, decimal format
//		float number = 123451234512345.567432145f;
//		DecimalFormat formatter = new DecimalFormat("#,###.####");
//		System.out.println("number: " + formatter.format(number));
		
		BigDecimal b1 = BigDecimal.valueOf(1123451234512345.567432145).setScale(2, RoundingMode.HALF_UP);
		System.out.println("b1: " + b1);
		
		//number format 
		int number = 5898;
		Locale locale = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(number));
	} 
}
