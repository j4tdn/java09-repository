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
		System.out.println(Math.round(5.7));
		System.out.println(Math.floor(5.7));
		//random
		
		Random rd=new Random();
		//0->n-1
		System.out.println("ran01====="+rd.nextInt(10));
		
		//a->b
		System.out.println("ran a->b===="+(5+rd.nextInt(16)));
		
		//format text:number,currency
		//numberFormat, decimal format
		float number=123456789.949f;
		DecimalFormat formatter=new DecimalFormat("#,###.####");
		System.out.println("number=="+formatter.format(number));

		
		//bigdecimal format
		float number2=1234.9499f;
		BigDecimal b1=BigDecimal.valueOf(number2).setScale(2, RoundingMode.HALF_UP);
		System.out.println("number2=="+b1 );
		
		
		//number format
		System.out.println("======================");

		int number3=5698;
		Locale locale=new Locale("vi","VN");
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		System.out.println("number3=="+nf.format(number3));
		
	}
}
