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
   		System.out.println(Math.round(5.7));
   		System.out.println(Math.floor(5.7));
   		
   		//random
   		Random rd = new Random();
   		//0 - n-1
   		System.out.println("rand 01:" + rd.nextInt(10));
   		// a- b
   		System.out.println("rand a-b:" + (rd.nextInt(16) + 5));
   		
   		// format text : number, currency
   		// number format , decimal format
   		// format :until a limit number
   		BigDecimal b1 = BigDecimal.valueOf(5782.237).setScale(5,RoundingMode.HALF_UP);
   		System.out.println("b1: " + b1);
   		int number = 5698;
   		Locale locale = new Locale("da","DK");
   		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
   		System.out.println(nf.format(number));
	}
}
