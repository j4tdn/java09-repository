package format;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;

public class Ex02 {
		public static void main(String[] args) {
			System.out.println(Math.round(7.5)); 
			System.out.println(Math.floor(7.5));
			Random rd = new Random();
			System.out.println("random01 " + rd.nextInt(10));
			float number = 44344343434f;
			DecimalFormat dcm = new DecimalFormat("#,###.###");
			System.out.println("number: "+dcm.format(number));
			BigDecimal bd = BigDecimal.valueOf(number).setScale(5, RoundingMode.HALF_UP);
			System.out.println(bd);
			Locale locale = new Locale("vi", "VN");
			NumberFormat nd = NumberFormat.getCurrencyInstance(locale);
			System.out.println(nd.format(number));
		}
}
