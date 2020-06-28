package utils;

import java.time.LocalDate;

import beans.Phone;
import beans.PhoneDetail;

public class PhoneDetailUtils {
	private PhoneDetailUtils() {		
	}
	
	//TODO: getBill by condition
	public static double getBill(PhoneDetail phoneDetail) {
		double result = 0;
		Phone[] phones = phoneDetail.getPhones();
		LocalDate date = phoneDetail.getDate();
		
		//foreach duyệt từng phần tử trong mảng k quan tâm đến chỉ số
		
		for(Phone phone: phones) {
			double price = phone.getPrice();
			if (date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}
