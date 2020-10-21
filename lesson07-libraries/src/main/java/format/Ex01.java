package format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// ngay thang nam weekday gio phut giay
		String pattern = "dd/MM/yyyy EEEE  hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);

		Date date = c.getTime();
		System.out.println(pattern + ": " + df.format(date));

		Calendar converter = Calendar.getInstance();
		converter.setTime(date);
	}

}
