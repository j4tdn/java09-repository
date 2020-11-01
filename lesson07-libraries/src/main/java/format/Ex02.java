package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		//math libraries
		System.out.println(Math.round(5.7) +"  " +  Math.floor(5.7));
		// random 
		Random rd = new Random();
		//0->n-1
		System.out.println(rd.nextInt(10));
		// a -> b (5->20)
		System.out.println(5+ rd.nextInt(16));
		// format text: number, currency
		//number format, decimal format
		//commercial round
		//format : until  LIMIT NUMBER
		//float number = 567756775677.556767586f;
		BigDecimal b1 = BigDecimal.valueOf(567756775677.556767586).setScale(2, RoundingMode.HALF_UP);
		
		
		System.out.println("number:  " + b1 );
		
		//number format 
		int number1 = 5698;
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf  = NumberFormat.getCurrencyInstance(lc);
		
		System.out.println(nf.format(number1));
		
		
		
		
	}

}
