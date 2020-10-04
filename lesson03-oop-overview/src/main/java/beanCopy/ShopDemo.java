package beanCopy;

import java.awt.font.NumericShaper;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class ShopDemo {
	public static void main(String[] args) {
		Item[] items = getItems();
		Customer[] customers = getCustomers();

		Item[] leNaItems = new Item[] { items[0], items[1] };
		ItemDetail leNaBillDetail = new ItemDetail(customers[0], leNaItems, LocalDate.of(2020, 5, 5));

		Item[] hoangTeoItems = new Item[] { items[3] };
		ItemDetail hoangTeoBillDetail = new ItemDetail(customers[1], hoangTeoItems, LocalDate.of(2020, 6, 2));

		double leNaBill = getBill(leNaBillDetail);
		double hoangTeoBill = getBill(hoangTeoBillDetail);
		System.out.println(format(leNaBill));
	}

	private static Item[] getItems() {
		return new Item[] { new Item("nokia", "ios", "red", 500), new Item("SS6", "ios", "green", 100),
				new Item("ipgone4", "iabc", "blue", 200), new Item("blackberry", "ixyz", "yellow", 400), };
	}

	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("123", "Le Na", "123345466789", "Da Nang"),
				new Customer("456", "Hoang Teo", "99999888999", "Ha Noi"), };
	}

	private static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Item[] items = itemDetail.getItems();
		LocalDate date = itemDetail.getDate();
		// foreach
		for (Item item : items) {
			double price = item.getPrice();
			if (date.isEqual(LocalDate.of(2020, 5, 5))  && price > 500) {
				price *= 0.9;
			}
			result += item.getPrice();
		}
		return result;

	}

	private static String format(double money) {
		return NumberFormat.getCurrencyInstance(new Locale("vn", "VN")).format(money);
	}

}
