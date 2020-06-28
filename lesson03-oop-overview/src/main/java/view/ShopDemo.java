package view;

import java.text.NumberFormat;import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Item;
import beans.ItemDetail;
import static utils.ItemDetailUtils.getBill;
import static utils.StringUntils.format;

public class ShopDemo {
	public static void main(String[] args) {
		Item[] items=getItems();
		Customer[] customers =getCustomer();
	
	//LeNa 2sp Nokia , Iphone4
	Item[] LeNaItem = new Item[] {items[0],items[1]};
	ItemDetail LeNaBillDetail = new ItemDetail(customers[0],LeNaItem, LocalDate.of(2020,5,5));
	//LeHoang 1sp SSS6
	Item[] LeHoangItem = new Item[] { items[0] };
	ItemDetail LeHoangBillDetail = new ItemDetail(customers[0],LeHoangItem, LocalDate.of(2020,5,5));

	
	
	//bill 
	
	double lenaBill = getBill(LeNaBillDetail);
	double lehoangBill = getBill(LeHoangBillDetail);
	System.out.println("LE NA : " + format(lenaBill));
	System.out.println("LE HOANG : " + format(lehoangBill));
	}
	
	

	
	// khởi tạo dữ liệu cho cửa hàng
	private static Item[] getItems() {

		return new Item[] { 
				new Item("Nokia1202", "Undefined", "black", 500), 
				new Item("Iphone", "ios", "white", 1000),
				new Item("LgG3", "android", "Green", 800), 
				new Item("SSS6", "android", "white", 1500), 
				};

	}
	// khởi tạo dữ liệu cho cửa hàng
	private static Customer[] getCustomer() {

		return new Customer[] { 
				new Customer("123", "Le Na", "123456789", "danang"), 
				new Customer("456", "Van Teo", "987654321", "QuangNan"),
				};
	}
}
