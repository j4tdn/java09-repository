package exercises.java07;

import java.time.LocalDate;
import java.util.Calendar;

import utils.DateUtils;

import static java.util.Calendar.*;

public class Ex03 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(1995, 8, 25);
		
		System.out.println(date.get(DAY_OF_MONTH) + " "
				+ DateUtils.getMonthOfYear(date.get(MONTH)) + " "
				+ date.get(YEAR) +" is a " + DateUtils.getDayOfWeek(date.get(DAY_OF_WEEK)));
		
		System.out.println("It is day number " + date.get(DAY_OF_YEAR) + " of this year,"
				+ " " + (date.getActualMaximum(DAY_OF_YEAR) - date.get(DAY_OF_YEAR)) + " days left");
		
		int dateNumber = 0;
		int dateNumberOfYear = 0;
		Calendar dateTemp = Calendar.getInstance();
		dateTemp.set(date.get(YEAR), 0, 1);
		int count = 1;
		
		while(dateTemp.get(YEAR) == date.get(YEAR)) {
			if(dateTemp.get(DAY_OF_WEEK) == date.get(DAY_OF_WEEK)) {
				if(date.get(DAY_OF_YEAR) >= dateTemp.get(DAY_OF_YEAR)) {
					dateNumber ++;
				}
				dateNumberOfYear ++;
				count = 7;
			}
			dateTemp.add(DAY_OF_YEAR, count);
		}
		System.out.println("It is " + DateUtils.getDayOfWeek(date.get(DAY_OF_WEEK)) + " number "
							+ dateNumber + " out of " + dateNumberOfYear + " in " + date.get(YEAR));
		
		dateTemp.set(date.get(YEAR), date.get(MONTH), 1);
		dateNumber = 0;
		int dateNumberOfMonth = 0;
		count = 1;
		while(dateTemp.get(MONTH) == date.get(MONTH)) {
			
			if(dateTemp.get(DAY_OF_WEEK) == date.get(DAY_OF_WEEK)) {
				if(date.get(DAY_OF_MONTH) >= dateTemp.get(DAY_OF_MONTH)) {
					dateNumber ++;
				}
				dateNumberOfMonth ++;
				count = 7;
			}
			dateTemp.add(DAY_OF_YEAR, count);;
		}
		System.out.println("It is " + DateUtils.getDayOfWeek(date.get(DAY_OF_WEEK)) + " number "
				+ dateNumber + " out of " + dateNumberOfMonth + " in " + DateUtils.getMonthOfYear(date.get(MONTH))
				+ " " + date.get(YEAR));
		
		System.out.println("Year " + date.get(YEAR) + " has " + date.getActualMaximum(DAY_OF_YEAR) + " days");
		
		System.out.println(DateUtils.getMonthOfYear(date.get(MONTH)) + " " + date.get(YEAR) + " has " + date.getActualMaximum(DAY_OF_MONTH) + " days");
	}
}
