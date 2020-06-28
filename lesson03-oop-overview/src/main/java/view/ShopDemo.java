package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Device;
import beans.ItemDetail;
import utils.StringUtils;

import static utils.ItemDetailUtils.getBill;
import static utils.StringUtils.format;

public class ShopDemo {

	public static void main(String[] args) {
		Device[] devices = getDevice();
		Customer[] customers = getCustomer();

		Device[] anDevices = new Device[] { devices[0], devices[1] };
		ItemDetail anBillDetail = new ItemDetail(customers[0], anDevices, LocalDate.of(2020, 5, 5));

		Device[] leDevices = new Device[] { devices[3] };
		ItemDetail leBillDetail = new ItemDetail(customers[1], leDevices, LocalDate.of(2020, 5, 5));

		// bill

		double anBill = getBill(anBillDetail);
		double leBill = getBill(leBillDetail);
		System.out.println("an :" + StringUtils.format(anBill));
		System.out.println("le :" + StringUtils.format(leBill));

	}

	
	private static Device[] getDevice() {
		return new Device[] { new Device("nokia", "nono", "black", 1.5d), new Device("iphone", "ios", "black", 1.5),

				new Device("lg", "android", "while", 2d), new Device("ss", "android", "orange", 1d) };
	}

	private static Customer[] getCustomer() {
		return new Customer[] { new Customer("an", "0123456789", "1", "phu yen"),
				new Customer("le", "0123459999", "2", "phu yen") };
	}

	

}
