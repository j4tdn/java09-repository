package utils;

import java.time.LocalDate;

import beans.Item;
import beans.ItemDetail;

public class ItemDetaildUtils {
	private ItemDetaildUtils() {
		// ngan ko cho tao doi tuong nay o ngoai
	}
	
	 public static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Item[] items = itemDetail.getItems();
		LocalDate date = itemDetail.getDate();
		for(Item item:items) { //for each
			double price = item.getPrice();
			if(date.isEqual(LocalDate.of(2020, 5, 5)) && (price > 590) ) {
				price *= 0.9;
			}
			result += price;
		}
		return result;
	}
}
