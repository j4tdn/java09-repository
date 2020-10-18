package datetime;

import java.io.ObjectInputStream.GetField;

import static java.util.Calendar.*;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
/**
 * Hello world!
 *
 */
public class Ex01 
{
    public static void main( String[] args )
    {
     //date month year
    	// hour 12 24 minute second
    	
    	//week of yeah
    	//
    	prinDateTimeInfo();
    }
    
    private static void prinDateTimeInfo() {
    	//date
    	Date date = new Date();
    	System.out.println("date: "+ date);
    		
    	//Calendar
    		Calendar c= Calendar.getInstance(Locale.FRANCE);
    		//c.set(MONTH, 3);
    		
    		int doMonth = c.get(DAY_OF_MONTH);
    		int month = c.get(MONTH)+1;
    		int year = c.get(YEAR);
    		System.out.println("calendar" + c );
    		System.out.println(doMonth+"-"+month+"-"+year);
    		
    		//day of week month year
    		int hour12 = c.get(Calendar.HOUR);
    		int hour24 = c.get(HOUR_OF_DAY);
    		
    		System.out.println(doMonth+"-"+month+"-"+year+"-"+hour12);
    		
    		//days of week
    		DayOfWeek[] dows = DayOfWeek.values();
    		c.set(Calendar.DAY_OF_MONTH ,14);
    		c.set(DAY_OF_MONTH, 2);
    		System.out.println("dow: "+ dows[c.get(DAY_OF_WEEK)-1]);
    		
    		System.out.println("dow: "+ c.get(DAY_OF_WEEK));
    		
    		//days of month 
    		System.out.println("days of month: "+c.getActualMaximum(DAY_OF_MONTH));
    		
    		//days of years 
    		System.out.println("days of month: "+c.getActualMaximum(DAY_OF_YEAR));
    
    	//first dow
    		//int fdow = c.get(DAY_OF_MONTH-c.get(DAY_OF_WEEK)+c.getFirstDayOfWeek());
    		System.out.println("default locate"+Locale.getDefault());
    		c.add(DAY_OF_MONTH, c.getFirstDayOfWeek()-c.get(DAY_OF_WEEK));
    		System.out.println("fdow weeK " + c.getFirstDayOfWeek());
    		System.out.println("first day of weeK " + c.get(DAY_OF_MONTH));
    }
    
    enum DayOfWeek {
    	sunday,Monday, Tuesday, Wednesday, Thursday, Friday, Stauday
    }
}
