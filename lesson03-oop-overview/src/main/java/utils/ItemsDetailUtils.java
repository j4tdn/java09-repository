package utils;

import java.time.LocalDate;

import beans.ItemAdv;
import beans.ItemDetail;


public class ItemsDetailUtils {
	private ItemsDetailUtils() {
		
	}
	public static double getBill(ItemDetail itemdetail) {
		double result = 0;
		ItemAdv[] items = itemdetail.getItem();
		LocalDate date = itemdetail.getDate();
		for (ItemAdv item : items) {
			double price = item.getCost();
			if (date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590) {
				price *= 0.9;

			}

			result += price;

		}
		return result;
	}
}
