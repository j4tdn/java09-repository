package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Item;
import beans.ItemDetail;
import static utils.ItemDetailUtils.getBill;
import static utils.StringUtils.format;


public class ShopDemo {
	public static void main(String[] args) {
		Item[] items = getItems();
		Customer[] customers = getCustomers();

		// leNa 2sp Nokia, Iphone4
		Item[] leNaItems = new Item[] { items[0], items[1] };
		ItemDetail leNaBillDetail = new ItemDetail(customers[0], leNaItems, LocalDate.of(2020, 5, 5));

		// hoangTeo 1sp sss6
		Item[] hoangTeoItems = new Item[] { items[3] };
		ItemDetail hoangTeoBillDetail = new ItemDetail(customers[1], hoangTeoItems, LocalDate.of(2020, 5, 6));

		// bill
		double leNaBill = getBill(leNaBillDetail);
		double hoangTeoBill = getBill(hoangTeoBillDetail);
		System.out.println("Lê Na: " + format(leNaBill));
		System.out.println("Hoàng Tèo: " + format(hoangTeoBill));
	}

	// Khởi tạo dữ liệu cho cửa hàng
	private static Item[] getItems() {
		return new Item[] { new Item("Nokia12020", "undefined", "black", 500),
				new Item("Iphone4", "ios", "white", 1000), new Item("LgG3", "android", "black", 800),
				new Item("Samsungs6", "android", "white", 1200) };
	}

	// Khởi tạo dữ liệu cho khách hàng
	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("Le Na", "123456789", "123", "Da Nang"),
				new Customer("Hoang Teo", "987654321", "456", "Quang Nam") };
	}
}
