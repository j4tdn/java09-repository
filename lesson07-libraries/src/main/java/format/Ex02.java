package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("round: " + Math.round(5.7));
		System.out.println("floor: " + Math.floor(5.7));
//		 random
		Random rd = new Random();
		System.out.println("rand 01: " + rd.nextInt());
		// random 5-20
		System.out.println("rand a-b:" + (5 + rd.nextInt(16)));
//	format text:number, currency
//	number format, decimal format
		float number = 143598645234.456789f;
		//comercial round
		BigDecimal b1 = BigDecimal.valueOf(number).setScale(5,RoundingMode.HALF_UP);
		System.out.println("b1: " + b1);
		
		//number format
		int number1 =5698;
		Locale locale= new Locale("vi","VN");
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(number1));
	}
}
