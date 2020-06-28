package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Item;
import beans.ItemDetail;
import utils.ItemDetailUtils;
import utils.StringUtils;
import static utils.StringUtils.format;

public class ShopDemo {
	public static void main(String[] args) {
		Item[] items = getItems();
		Customer[] customers = getCustomers();
		// LeNa 2sp
		Item[] leNaItems = new Item[] { items[0], items[3] };
		ItemDetail leNaBillDetail = new ItemDetail(customers[0], leNaItems, LocalDate.of(2020, 5, 5));

		// hoangTeo
		Item[] hoangTeoItems = new Item[] { items[3] };
		ItemDetail hoangTeoBillDetail = new ItemDetail(customers[1], hoangTeoItems, LocalDate.of(2020, 11, 25));

		// bill
		double leNaBill = ItemDetailUtils.getBill(leNaBillDetail);
		double hoangTeoBill = ItemDetailUtils.getBill(hoangTeoBillDetail);
		System.out.println("Le Na" + StringUtils.format(leNaBill));
		System.out.println("Hoang Teo" + format(hoangTeoBill));
	}

	// Khởi tạo dữ liệu cho cửa hàng

	private static Item[] getItems() {
		return new Item[] { new Item("Nokia1200", "android", "black", 500), new Item("Iphone4", "ios", "white", 1000),
				new Item("Lg03", "android", "black", 800), new Item("S6", "android", "white", 1200), };
	}

	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("leNa", "02459", "123", "Quang Nam"),
				new Customer("hoangTeo", "09589", "456", "Da Nang"),

		};
	}

	// Khởi tạo dữ liệu cho khách hàng
}
