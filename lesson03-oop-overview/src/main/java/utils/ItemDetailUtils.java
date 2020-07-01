package utils;

import java.time.LocalDate;

import beans.ItemDetail;
import view.Item;

public class ItemDetailUtils {
	private ItemDetailUtils() {
		
	}
	public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Item[] items = itemDetail.getItems();
		LocalDate date = itemDetail.getDate();
		for (Item item: items) {
			double price = item.getPrice();
			if(date.isEqual(LocalDate.of(2020, 5, 5)) && price > 590 ) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}
