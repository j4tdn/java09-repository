package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

public class FormatUtils {
	public static String format(LocalDate ldate, String pattern) {
		return ldate.format(DateTimeFormatter.ofPattern(pattern));
	}

	public static String formatCalendar(Calendar c, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = c.getTime();
		return df.format(date);
	}

	public static LocalDateTime formatDateTime(String s, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return LocalDateTime.parse(s, formatter);
	}
}
