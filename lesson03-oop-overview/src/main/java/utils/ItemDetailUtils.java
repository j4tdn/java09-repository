package utils;

import java.time.LocalDate;

import beans.Devices;
import beans.ItemDetail;

public class ItemDetailUtils {
	private ItemDetailUtils() {
	}
	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Devices[] devices = itemDetail.getDevices();
		// foreach
		LocalDate date = itemDetail.getDate();
		for (Devices device : devices) {
			double price = device.getPrice();
			if (date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}
