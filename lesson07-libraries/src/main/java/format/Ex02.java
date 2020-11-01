package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {

		// math libraries
		System.out.println("round:" + Math.round(5.7));// lam tron tren
		System.out.println("floor:" + Math.floor(5.7));// lam tron duoi
		// random
		Random rd = new Random();
		System.out.println("rand 01:" + rd.nextInt(10));// 0->n-1
		System.out.println("rand 02:" + 5 + rd.nextInt(16));// 5->20
		// format: number, currency
		// numbeer format, decimal format
		float number = 3278.45672343242323f;

//		DecimalFormat formatter=new DecimalFormat("#,###.####");//#,###.0000
//		System.out.println("number:"+formatter.format(number));
		BigDecimal b1 = BigDecimal.valueOf(number);
		b1 = b1.setScale(5,RoundingMode.HALF_UP);
		System.out.println("b1:" + b1);
		//number format
		int num=5698;
		Locale locale=new Locale("vi","VN");
		NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(num));
		
		
		

	}
}
