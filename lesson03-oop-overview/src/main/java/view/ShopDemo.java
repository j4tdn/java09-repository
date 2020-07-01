package view;

import java.text.NumberFormat;
import java.time.LocalDate;

import beans.ItemAdv;
import beans.ItemDetail;
import static utils.StringUtils.format;

import static utils.ItemsDetailUtils.getBill;

public class ShopDemo {
	public static void main(String[] args) {
		ItemAdv[] items = getItems();
		Customers[] customers = getCustomers();

		ItemAdv[] LeNaItems = new ItemAdv[] { items[0], items[1] };
		ItemDetail LeNaBillDetail = new ItemDetail(customers[0], LeNaItems, LocalDate.of(2020, 5, 5));

		ItemAdv[] hoangteoItems = new ItemAdv[] { items[0], items[3] };
		ItemDetail hoangteoDetail = new ItemDetail(customers[1], hoangteoItems, LocalDate.of(2020, 5, 6));
		double lenaBill = getBill(LeNaBillDetail);
		double hoangteoBill = getBill(hoangteoDetail);
		System.out.println("hoang teo: " + format(hoangteoBill));
		System.out.println("le na: " + format(lenaBill));
	}

	// khoi tao du lieu cho cua hang
	private static ItemAdv[] getItems() {
		return new ItemAdv[] { new ItemAdv("nokia", "undefined", "black", 500), new ItemAdv("iphone4", "ios", "black", 1000),
				new ItemAdv("lgG3", "android", "yellow", 800), new ItemAdv("sámung", "android", "black", 1300),

		};
	}
	// khoi tao du lieu cho khach hang

	private static Customers[] getCustomers() {
		return new Customers[] { new Customers("123", "lena", "00399445", "tran phu"),
				new Customers("456", "ew", "00399445", " da nang"), };

	}

}
