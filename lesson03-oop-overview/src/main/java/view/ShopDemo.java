package view;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import beans.Customer;
import beans.ItemDetail;
import beans.Phone;
import static utils.ItemDetailUtils.getBill;
import static utils.StringUtils.format;

public class ShopDemo {
	public static void main(String[] args) {
		List<Customer> customer = getCustomers();
		List<Phone> phones = getPhones();

		Phone[] leLiItems = new Phone[] { phones.get(0), phones.get(1) };
		ItemDetail leLiBillDetail = new ItemDetail(customer.get(4), leLiItems, LocalDate.of(2020, 5, 5));

		Phone[] leHiItems = new Phone[] { phones.get(1), phones.get(2) };
		ItemDetail leHiBillDetail = new ItemDetail(customer.get(0), leHiItems, LocalDate.of(2021, 5, 26));

		double leLiBill = getBill(leLiBillDetail);
		double leHiBill = getBill(leHiBillDetail);

		System.out.println("Lê Li: " + format(leLiBill));
		System.out.println("Lê Hi: " + format(leHiBill));

	}

	private static List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Lê Hi", "12345", "id01", "Hải Châu"));
		customers.add(new Customer("Lê Bi", "12346", "id02", "Liên Chiểu"));
		customers.add(new Customer("Lê Ni", "12347", "id03", "Thanh Khê"));
		customers.add(new Customer("Lê Vi", "12348", "id04", "Hòa Vang"));
		customers.add(new Customer("Lê Li", "12349", "id05", "Hải Châu"));
		return customers;
	}

	private static List<Phone> getPhones() {
		List<Phone> phones = new ArrayList<Phone>();
		phones.add(new Phone("p01", "Android", "red", 1000d));
		phones.add(new Phone("p02", "IOS", "black", 2000d));
		phones.add(new Phone("p03", "Android", "yellow", 3000d));
		phones.add(new Phone("p04", "IOS", "gray", 4000d));
		phones.add(new Phone("p05", "IOS", "white", 5000d));
		return phones;
	}
}
