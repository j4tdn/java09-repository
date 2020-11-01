package fomat;

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
		System.out.println("floor : " + Math.floor(5.7));

		// random
		Random rd = new Random();
		// 0 -> n-1
		System.out.println("rand 01 : " + rd.nextInt(10));

		// a.- b 5->20
		System.out.println("rand a-b : " + (5 + rd.nextInt(16)));

		// format text: number,currency
		// number format, decimal format

		// commercial round
		BigDecimal b1 = BigDecimal.valueOf(87258725872.44544654564548).setScale(5, RoundingMode.HALF_UP);
		System.out.println("b1 : " + b1);

		// number format

		int number = 5698;
		Locale locale = new Locale("vi ", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(number));
	}

}
