package ex02;

import java.time.LocalDate;
import java.time.Period;

public class RelationshipCalculator {
	public static void main(String[] args) {
		LocalDate start=LocalDate.of(2019,11,8);
		LocalDate end=LocalDate.of(2020,12,7);
		Period period =Period.between(start, end);
		System.out.println(period.getDays());
		
	}
}
