package format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
// ngày tháng năm weekday:giờ phút giây
		String pattern = "dd/MM/yyyy 'T' hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = c.getTime();
		System.out.println(pattern+": "+df.format(date));
	
	}
}
