package utils;

import java.time.LocalDate;

import beans.Item;
import beans.ItemDetail;

public class ItemDetailUtils {
	
	private ItemDetailUtils() {
	}
	
	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		LocalDate date = itemDetail.getDate();
		for (Item item : itemDetail.getItem()) {
			double price = item.getCost();
			if (date.equals(LocalDate.of(2020, 05, 05)) && price > 590) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}
