package view;

import java.time.LocalDate;

import beans.Customer;
import beans.ItemDetail;
import beans.Phone;

public class ShopView {
	public static void main(String[] args) {
		Phone[] phones = getPhones();
		Customer[] customers = getCustomers();

		Customer customer1 = customers[0];
		Phone[] c1Phones = new Phone[] { phones[1], phones[3] };
		ItemDetail c1Detail = new ItemDetail(customer1, c1Phones, LocalDate.of(2020, 5, 5));
		System.out.println(c1Detail);

		Customer customer2 = customers[2];
		Phone[] c2Phones = new Phone[] { phones[0], phones[1] };
		ItemDetail c2Detail = new ItemDetail(customer2, c2Phones, LocalDate.of(2020, 4, 22));
		System.out.println(c2Detail);
	}

	private static Phone[] getPhones() {
		return new Phone[] { new Phone("Y8", "Android", "yellow", 100d),
				new Phone("Xiaomi Redmi", "Android", "black", 2000d), new Phone("Iphone 8", "IOS", "white", 1000d),
				new Phone("Samsung", "Android", "red", 150d) };
	}

	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("Le Teo", "84581900", "KNFJ335H", "Hòa Khánh"),
				new Customer("Le Hoàng", "04581958", "LFG223NG", "Quảng Ngãi"),
				new Customer("Le Cao Viet Huy", "09320445", "OG32GH4", "Quảng Nam") };
	}
}
