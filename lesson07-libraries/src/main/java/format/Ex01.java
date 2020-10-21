package format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		String pattern = "dd/MM/yyyy EEEE 'Ahihi' hh:mm:ss a";
		DateFormat df = new SimpleDateFormat(pattern);
		System.out.println(df.format(c.getTime()));
		
		
	}
}
