package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Item;
import beans.ItemDetail;

public class ShopDemo {
	public static void main(String[] args) {
		Item[] items = getItems();
		Customer[] customers = getCustomers();
		// LeNa 2sp Nokia, Iphone4
		// HoangTeo 1sp SSS6
		Item[] leNaItems = new Item[] { items[0], items[1] };
		ItemDetail leNaBillDetail = new ItemDetail(customers[0], leNaItems, LocalDate.of(2020, 5, 5));
		Item[] hoangTeoItems = new Item[] { items[3] };
		ItemDetail hoangTeoBillDetail = new ItemDetail(customers[1], hoangTeoItems, LocalDate.of(2020, 6, 22));
		// bill
		double leNaBill=getBill(leNaBillDetail);
		double hoangTeoBill=getBill(hoangTeoBillDetail);
		System.out.println("Lê Na: "+format(leNaBill));
		System.out.println("Hoàng Tèo: "+hoangTeoBill);
	}
	private static String format(double money)
	{
		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(money);
	}

	private static double getBill(ItemDetail itemDetail) {
		double result = 0;
		Item[] items = itemDetail.getItems();
		LocalDate date =itemDetail.getDate();
		
		// foreach
		for (Item item : items) {
			double price =item.getPrice();
			if (date.isEqual(LocalDate.of(2020,5,5))&&price>590) {
				price*=0.9;
			}
			result += price;
		}
		return result;
	}

//khởi tạo dữ liệu cho cửa hàng
	private static Item[] getItems() {
		return new Item[] { new Item("Nokia1202", "undefined", "black", 500), new Item("Iphone4", "ios", "white", 1000),
				new Item("LgG3", "android", "black", 800), new Item("SSS6", "android", "white", 1200) };
	}

//khởi tạo đối tượng cho khách hàng
	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("123", "Le Na", "123456789", "Da Nang"),
				new Customer("456", "Hoang Teo", "987654321", "Quang Nam") };
	}
}
