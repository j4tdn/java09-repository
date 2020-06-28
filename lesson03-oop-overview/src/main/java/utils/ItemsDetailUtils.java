package utils;

import java.time.LocalDate;

import beans.ItemDetail;
import view.Item;


public class ItemsDetailUtils {
	private ItemsDetailUtils() {
		
	}
	public static double getBill(ItemDetail itemdetail) {
		double result = 0;
		Item[] items = itemdetail.getItem();
		LocalDate date = itemdetail.getDate();
		for (Item item : items) {
			double price = item.getCost();
			if (date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590) {
				price *= 0.9;

			}

			result += price;

		}
		return result;
	}
}
