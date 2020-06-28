package beans;

import java.time.LocalDate;
import static utils.ItemDetailUtils.getBill;
import static utils.StringUtils.format;

public class ShopDemo {

	public static void main(String[] args) {
		Item[] items = getItems();
		Customer[] customers = getCustomers();
		Item[] leNaItems = new Item[] { items[0], items[1] };
		Item[] hoangTeoItems = new Item[] { items[2], items[3] };
		ItemDetail leNaBillDetail = new ItemDetail(customers[0], leNaItems, LocalDate.of(2020, 5, 5));
		ItemDetail hoangTeoBillDetail = new ItemDetail(customers[1], hoangTeoItems, LocalDate.of(2020, 5, 5));
		double leNaBill = getBill(leNaBillDetail);
		double hoangTeoBill = getBill(hoangTeoBillDetail);
		System.out.println("Le Na:" + format(leNaBill));
		System.out.println("Hoang Teo:" + format(hoangTeoBill));
	}

	private static Item[] getItems() {
		return new Item[] { new Item("Nokia1202", "underfied", "black", 500), new Item("Iphone4", "ios", "white", 1000),
				new Item("LgG3", "android", "black", 800), new Item("SSS6", "android", "white", 1200) };
	}

	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("123", "Le Na", "123456789", "Da Nang"),
				new Customer("456", "Hoang Teo", "987654321", "Quang Nam") };
	}
}
