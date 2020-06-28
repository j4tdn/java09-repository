package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customer;
import beans.Device;
import beans.DeviceDetail;
import static utils.StringUtils.format;


import static utils.DeviceDetailUtils.getBill;





public class ShopDemo {
	public static void main(String[] args) {
		Device[] devices = getDevices();
		Customer[] customers = getCustomers();
		// khach hang le na
		Device[] leNaDevice = new Device[] { devices[0], devices[1] };

		DeviceDetail leNaBillDetail = new DeviceDetail(customers[0], leNaDevice, LocalDate.of(2020, 5, 5));
		// khach hang hoang teo
		Device[] hoangTeoDevice = new Device[] { devices[3] };

		DeviceDetail hoangTeoBillDetail = new DeviceDetail(customers[1], hoangTeoDevice, LocalDate.of(2020, 5, 6));
		// bill
		
		double lenaBill = getBill(leNaBillDetail);
		double hoangteoBill = getBill(hoangTeoBillDetail);
		System.out.println("Lê Na: " + format(lenaBill));
		System.out.println("Hoàng Tèo: " + format(hoangteoBill));

	}

	

	
	// khoi tao du lieu cho cua hang
	private static Device[] getDevices() {

		return new Device[] { new Device("Nokia1202", "underfined", "black", 500),
				new Device("Iphone4", "IOS", "black", 1000), new Device("LgG3", "android", "black", 800),
				new Device("SSS6", "android", "white", 1200),

		};

	}

	// khoi tao du lieu cho khach hang
	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("123", "Le Na", "123456789", "Da Nang"),
				new Customer("456", "Hoang teo", "987654321", "Hue"), };

	}

}
