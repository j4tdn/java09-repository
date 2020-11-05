package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Format {
	private Format() {
		
	}
	
	public static String getDateFormat(Calendar c) {
		String pattern = "dd/MM/yyyy hh:mm:ss";
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = c.getTime();
		return df.format(date).toString();
	}
	
	public static String getDateFormat(LocalDateTime ldt) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		return formatter.format(ldt);
	}
}
