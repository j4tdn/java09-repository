package exercises.java08;

import java.time.LocalDate;

public class Ex03 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1995, 9, 25);
		System.out.println(date.getDayOfMonth() + " "
							+ date.getMonth() + " "
							+ date.getYear() +" is a " + date.getDayOfWeek());
		
		System.out.println("It is day number " + date.getDayOfYear() + " of this year,"
							+ " " + (date.lengthOfYear() - date.getDayOfYear()) + " days left");
		
		int dateNumber = 0;
		int dateNumberOfYear = 0;
		LocalDate dateTemp = LocalDate.of(date.getYear(), 1, 1);
		int count = 1;
		while(dateTemp.getYear() == date.getYear()) {
			if(dateTemp.getDayOfWeek() == date.getDayOfWeek()) {
				if(date.getDayOfYear() >= dateTemp.getDayOfYear()) {
					dateNumber ++;
				}
				dateNumberOfYear ++;
				count = 7;
			}
			dateTemp = dateTemp.plusDays(count);
		}
		System.out.println("It is " + date.getDayOfWeek() + " number "
							+ dateNumber + " out of " + dateNumberOfYear + " in " + date.getYear());
		
		dateTemp = LocalDate.of(date.getYear(), date.getMonth(), 1);
		dateNumber = 0;
		int dateNumberOfMonth = 0;
		count = 1;
		while(dateTemp.getMonth() == date.getMonth()) {
			
			if(dateTemp.getDayOfWeek() == date.getDayOfWeek()) {
				if(date.getDayOfMonth() >= dateTemp.getDayOfMonth()) {
					dateNumber ++;
				}
				dateNumberOfMonth ++;
				count = 7;
			}
			dateTemp = dateTemp.plusDays(count);
		}
		System.out.println("It is " + date.getDayOfWeek() + " number "
				+ dateNumber + " out of " + dateNumberOfMonth + " in " + date.getMonth()
				+ " " + date.getYear());
		
		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days");
		
		System.out.println(date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days");
	}
}
