package view;

import java.text.NumberFormat;
import java.util.Locale;

import java.time.LocalDate;
import beans.ItemDetail;
import static utils.StringUtils.format;

import static utils.ItemDetailUtils.getBill;;

public class ShopDemo {
	public static void main(String[] args) {
		Item[] items = getItems();
		Customer[] customers = getCustomers();
		
		Item[] leNaItems = new Item[] {items[0], items[1]};
		ItemDetail leNaBillDetail = new ItemDetail(customers[0],leNaItems, LocalDate.of(2020, 5, 5) );
		
		Item[] hoangTeoItems = new Item[] {items[3]};
		ItemDetail hoangTeoBillDetail = new ItemDetail(customers[1],hoangTeoItems, LocalDate.of(2020, 5, 6) );
	
		double lenaBill = getBill(leNaBillDetail);
		double hoangTeoBill = getBill(hoangTeoBillDetail);
		
		
		
		System.out.println("lee na: " + format(lenaBill));
		System.out.println(" hoang teo: " +format(hoangTeoBill));
	}
	
	
	
	// khởi tạo dữ liệu cho cửa hàng
	private static Item[] getItems() {
		return new Item[] {
			new Item("nokia1202", "android", "red", 500),
			new Item("iphone4", "ios", "white", 1000),
			new Item("lgg3", "android", "pin", 800),
			new Item("sss6", "android", "black", 1200),
		};
	}
	// khởi tạo dữ liệu cho khách hàng
	private static Customer[] getCustomers() {
		return new Customer[] {
				new Customer("123", " le na", "3523523", "da nang"),
				new Customer("456", " hoang teo", "3523985782", "quang nam"),
		};
	}
}