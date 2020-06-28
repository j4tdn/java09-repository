package utils;

import java.time.LocalDate;

import beans.ItemDetail;
import beans.Phone;

public class ItemDetailUtils {
	private ItemDetailUtils() {
	}

	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Phone[] phones = itemDetail.getPhones();
		LocalDate date = itemDetail.getDate();
		for (Phone phone : phones) {
			double price = phone.getPrice();
			if (date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}
