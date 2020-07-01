package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Item;
import beans.ItemDetail;
import utils.ItemDetaildUtils;
import utils.StringUtils;

import static  utils.ItemDetaildUtils.getBill;
import static utils.StringUtils.format;


public class ShopDemo {
	public static void main(String[] args) {
		
		Item[] items = getItems();
		Customer[] customers = getCustomer();
		
		Item[] leNaItems = new Item[] {items[0],items[1]};
		ItemDetail leNaBillDetail = 
				new ItemDetail(customers[0], leNaItems, LocalDate.of(2020, 5, 5));
		
		
		Item[] hoangTeoItems = new Item[] {items[3]};
		ItemDetail hoangTeoBillDetail = 
				new ItemDetail(customers[1], hoangTeoItems, LocalDate.of(2020, 5, 6));
		
		double leNaBill = ItemDetaildUtils.getBill(leNaBillDetail);
		double hoangTeoBill = getBill(hoangTeoBillDetail);// import truc tiep phia tren roi
		
		System.out.println("Le na: " + StringUtils.format(leNaBill));
		System.out.println("Hoang teo: " + format(hoangTeoBill));


	}
//	private static String format(double money) {
//		return NumberFormat.getCurrencyInstance(new Locale("vi", "VN")).format(money);
//	}
	
//	private static double getBill(ItemDetail itemDetail) {
//		double result = 0;
//		Item[] items = itemDetail.getItems();
//		LocalDate date = itemDetail.getDate();
//		for(Item item:items) { //for each
//			double price = item.getPrice();
//			if(date.isEqual(LocalDate.of(2020, 5, 5)) && (price > 590) ) {
//				price *= 0.9;
//			}
//			result += price;
//		}
//		return result;
//	}
	
	private static Item[] getItems() {
		return new Item[] {
			new Item("Nokia1202", "undefined", "black", 500),
			new Item("Iphone4", "ios", "white", 1000),
			new Item("LgG3", "android", "black", 800),
			new Item("SSS6", "android", "white", 1200),
		};
	}
	
	private static Customer[] getCustomer() {
		return new Customer[] {
			new Customer("123", "Le Na", "123456789", "Ha noi"),
			new Customer("456", "Le Teo", "392449519", "Da Nang"),
		};
	}
}
