package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("round: " + Math.round(5.7));
		System.out.println("floor: " + Math.floor(5.7));

		// Random

		// format text: number, currency
		// float number = 345089086.5799083089080806f;
		// DecimalFormat formatter = new DecimalFormat("#,###,###.000");
		// System.out.println("number "+formatter.format(number));

		// BigDecimal b1 = BigDecimal.valueOf(number).setScale(2, RoundingMode.HALF_UP);
		// System.out.println(b1);

		int number = 5678;
		Locale locale = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		System.out.println(nf.format(number));

	}

}
