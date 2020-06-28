package view;

import java.text.NumberFormat;
import java.time.LocalDate;

import beans.ItemDetail;
import static utils.StringUtils.format;

import static utils.ItemsDetailUtils.getBill;

public class ShopDemo {
	public static void main(String[] args) {
		Item[] items = getItems();
		Customers[] customers = getCustomers();

		Item[] LeNaItems = new Item[] { items[0], items[1] };
		ItemDetail LeNaBillDetail = new ItemDetail(customers[0], LeNaItems, LocalDate.of(2020, 5, 5));

		Item[] hoangteoItems = new Item[] { items[0], items[3] };
		ItemDetail hoangteoDetail = new ItemDetail(customers[1], hoangteoItems, LocalDate.of(2020, 5, 6));
		double lenaBill = getBill(LeNaBillDetail);
		double hoangteoBill = getBill(hoangteoDetail);
		System.out.println("hoang teo: " + format(hoangteoBill));
		System.out.println("le na: " + format(lenaBill));
	}

	// khoi tao du lieu cho cua hang
	private static Item[] getItems() {
		return new Item[] { new Item("nokia", "undefined", "black", 500), new Item("iphone4", "ios", "black", 1000),
				new Item("lgG3", "android", "yellow", 800), new Item("sámung", "android", "black", 1300),

		};
	}
	// khoi tao du lieu cho khach hang

	private static Customers[] getCustomers() {
		return new Customers[] { new Customers("123", "lena", "00399445", "tran phu"),
				new Customers("456", "ew", "00399445", " da nang"), };

	}

}
