package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Phone;
import beans.PhoneDetail;
import utils.PhoneDetailUtils;
import utils.StringUtils;

import static utils.PhoneDetailUtils.getBill;

public class ShopDemo {
	public static void main(String[] args) {
		Phone[] Phones = getPhones();
		Customer[] Customers = getCustomers();

		// lan, 2 Nokia1280, Iphone 4;
		Phone[] lanPhones = new Phone[] { Phones[0], Phones[1] };
		PhoneDetail lanBillDetail = new PhoneDetail(Customers[0], lanPhones, LocalDate.of(2020, 5, 5));
		// Huy, 2 sp
		Phone[] huyPhones = new Phone[] { Phones[3] };
		PhoneDetail huyBillDetail = new PhoneDetail(Customers[1], huyPhones, LocalDate.of(2020, 5, 6));
		
		double lanBill = getBill(lanBillDetail);
		double huyBill = getBill(huyBillDetail);
		
		System.out.println("lan: " + StringUtils.format(lanBill));
		System.out.println("huy: " + StringUtils.format(huyBill));
		
	}
	
	
	

	// khởi tạo dữ liệu cho cửa hàng
	private static Phone[] getPhones() {
		return new Phone[] { new Phone("Nokia1280", "underfined", "black", 500d),
				new Phone("Iphone4", "ios", "white", 1000d), 
				new Phone("LgG3", "android", "black", 800d),
				new Phone("SSS6", "android", "white", 1200d), 
				};
	}

	// khởi tạo dữ liệu cho khách hàng
	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("lan", "0966759343", "197403315", "trung nam land"),
				new Customer("huy", "deo biet sdt", "deo biet id", "ktx phia tay"),
				new Customer("hung", "deo biet sdt", "deo biet id", "ktx phia tay"), };
	}

}
