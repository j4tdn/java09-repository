package datetime;

import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.Locale;

import javax.xml.crypto.Data;

public class Ex01 
{
    public static void main( String[] args )
    {
        // date,month, year
    	// hour 12 24, minute, second
    	// day of week, month, year
    	//week of year
    	printDateTimeInFo();
    }
    private static void printDateTimeInFo() {
    	//Date
    	Date date= new Date();
    	System.out.println("date" + date);
    	
    	//calendar
    	Calendar c =  Calendar.getInstance();
    	c.set(MONTH,3);
    	System.out.println("calendar" + c);
    	int doMonth = c.get(DAY_OF_MONTH);
    	int month = c.get(MONTH) + 1;
    	int year = c.get(YEAR);
    	int hour12 = c.get(HOUR);
    	int hour24 = c.get(HOUR);
    	System.out.println(doMonth + "-" + month + "-" + year );
    	
    	System.out.println(doMonth + "-" + month + "-" + year + "-" + hour12);
    	
    	//days of week
    	DayOfWeek[] dows= DayOfWeek.values();
    	
    	System.out.println("days of week: "+ dows[c.get(DAY_OF_WEEK)-1]);
    	//c.set(Calendar.DAY_OF_MONTH, 14);
    	c.set(DAY_OF_MONTH, 2);
    	
    	// fist dow
    	c.add(DAY_OF_MONTH, c.getFirstDayOfWeek() - c.get(DAY_OF_WEEK));
    	
    	int fdow = c.get(DAY_OF_MONTH) - c.get(DAY_OF_WEEK) + c.getFirstDayOfWeek();
    	System.out.println(" default locale: " + Locale.getDefault());
    	System.out.println(" fdow weekday: " + c.getFirstDayOfWeek());
    	
    	System.out.println("fdow value: " + c.get(DAY_OF_MONTH));
    	
    	// days in month 
    	
    	System.out.println("days of month: "+ c.getActualMaximum(DAY_OF_MONTH));
    	//days in year
    	System.out.println("days of year: "+ c.getActualMaximum(DAY_OF_YEAR));
    	
    	
    	}
    enum DayOfWeek{
    	Sunday, Monday, Tuesday, Wed, Thus, Fri, Sa
    }
}
