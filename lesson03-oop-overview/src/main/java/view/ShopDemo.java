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
		Item[] item = getItems();
		Customer[] customer = getCustomers();

		Item[] tienItem = new Item[] { item[1], item[2] };
		Item[] canhItem = new Item[] { item[3] };
		ItemDetail tienItemDetail = new ItemDetail(customer[3], tienItem, LocalDate.of(2020, 06, 28));
		ItemDetail canhItemDetail = new ItemDetail(customer[2], canhItem, LocalDate.of(2020, 06, 28));

		System.out.println("Tiên: " + format(getBill(tienItemDetail)));
		System.out.println("Cảnh: " + format(getBill(canhItemDetail)));
	}

	private static Item[] getItems() {
		return new Item[] { new Item("Nokia1202", "undefined", "black", 500), new Item("Iphone4", "Ios", "white", 1000),
				new Item("lgG3", "android", "black", 800), new Item("SSS6", "android", "red", 900) };
	}

	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("1919191919", "Nguyễn Phong", "0399432071", "Quảng Nam"),
				new Customer("1919191919", "Phạm Thị Vạn", "0906512761", "Quảng Nam"),
				new Customer("1919191919", "Nguyễn Tuấn Cảnh", "0969146385", "Quảng Nam"),
				new Customer("1919191919", "Nguyễn Văn Tiên", "0356112087", "Quảng Nam") };
	}
}
