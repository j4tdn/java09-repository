package utils;

import java.time.LocalDate;

import beans.Device;
import beans.ItemDetail;

public class ItemDetailUtils {
	private ItemDetailUtils() {
		
	}
	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Device[] items = itemDetail.getDevice();

		LocalDate date = itemDetail.getDate();

		for (Device item : items) {
			double price = item.getPrice();
			if (date.equals(LocalDate.of(2020, 5, 5)) && price > 0.59) {
				price = 0.9 * price;
			}
			result += price;
		}

		return result;

	}

}
