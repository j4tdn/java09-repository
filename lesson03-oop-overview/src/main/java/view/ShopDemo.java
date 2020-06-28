package view;

import beans.Devices;
import beans.ItemDetail;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.Customers;
import static utils.ItemDetailUtils.getBill;
import static utils.StringUtils.format;

public class ShopDemo {
	public static void main(String[] args) {
		Devices[] devices = getdevices();
		Customers[] customers = getcustomers();

		Devices[] Teodevices = new Devices[] { devices[0], devices[1] };
		ItemDetail Teobilldetail = new ItemDetail(customers[0], Teodevices, LocalDate.of(2020, 5, 5));

		Devices[] namdevices = new Devices[] { devices[3], devices[1] };
		ItemDetail nambilldetail = new ItemDetail(customers[1], namdevices, LocalDate.of(2020, 5, 5));

		// bill
		double Teobill = getBill(Teobilldetail);
		double nambill = getBill(nambilldetail);
		System.out.println(" teo pha tra : " + format(Teobill));
		System.out.println("nam phai tra : " + format(nambill));

	}

	// Khoi tao du lieu cho cua hang
	private static Devices[] getdevices() {
		return new Devices[] { new Devices("nokia lumia", "window", "black", 500),
				new Devices("iphone", "ios", "black", 500), new Devices("htc", "android", "white", 700),
				new Devices("samsung", "android", "black", 900), };
	}

	// khoi tao du lieu cho khach hang
	private static Customers[] getcustomers() {
		return new Customers[] { new Customers("123", "Teo", "1213092039", "da nang"),
				new Customers("144", "Nam", "1213046465", "da nang"),

		};
	}
}
