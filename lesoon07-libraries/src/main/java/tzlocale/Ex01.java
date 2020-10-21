package tzlocale;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Ex01 {
	//locale : language country
	//used:=> Calendar+getDayOfFirst
	public static Locale VIETNAM = new Locale("vi","VN");
		public static void main(String[] args) {
			System.out.println(Locale.getDefault());
			System.out.println("fdow: "+Calendar.getInstance(VIETNAM).getFirstDayOfWeek());
	   String[]  timezones = TimeZone.getAvailableIDs();
	
	   System.out.println(TimeZone.getDefault());
		
	 
			for( String timezone: timezones ) {
				System.out.println(timezone);
			}
			System.out.println("==============================");
			Calendar c = Calendar.getInstance(TimeZone.getTimeZone("EUROPE/Berlin"));
					System.out.println(c);
					System.out.println(c.get(Calendar.HOUR_OF_DAY));
					System.out.println((c.get(Calendar.MINUTE)));
		}
		
}
