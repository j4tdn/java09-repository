package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		// math libraries
		System.out.println("round : " + Math.round(5.7));
		System.out.println("floor: " + Math.floor(5.7));

		// random
		Random rd = new Random();
		// tu 0 - den n-1
		System.out.println("random: " + rd.nextInt(10));

		//  tu a den b     5 -20
		System.out.println("Random a den b : " + (5 + rd.nextInt(16)));
		//format text: number, currency
		//number format , decimal format
		//commercial round
		// format: until a limit number
		//float number=3829585546587465.78789908908098f;
		BigDecimal b1 = BigDecimal.valueOf(3829585546587465.78789908908098f).setScale(2,RoundingMode.HALF_UP);
		System.out.println("b1: "+ b1);
		//DecimalFormat formatter = new DecimalFormat("#,###,###.#####");
		//System.out.println("number: " + formatter.format(number));
		
		//number format
		int number = 5764;
		Locale locale = new Locale("vi" , "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(number));
		
	}
}
