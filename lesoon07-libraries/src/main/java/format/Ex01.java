package format;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c= Calendar.getInstance();
		
		String pattern = "dd/MM/yyyy E hh:mm:ss aa";
		
		DateFormat df = new SimpleDateFormat(pattern);
		
		Date date = c.getTime();
		
		System.out.println(pattern + " là: " + df.format(date));
		
		Calendar convert = Calendar.getInstance();
		convert.setTime(date);

	}

}
