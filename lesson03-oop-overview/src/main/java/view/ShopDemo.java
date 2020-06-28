package view;

import java.awt.event.ItemEvent;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import beans.ItemDetail;
import util.StringUtil;

import static util.ItemDetaileUtils.getBill;;

public class ShopDemo {
	public static void main(String[] args) {
		Device[] Devices = getDevice();
		Customer[] customers = getCustomers();
		Device[] LenaItem = new Device[] { Devices[0], Devices[1] };
		ItemDetail leNaBillDetail = new ItemDetail(customers[0], LenaItem, LocalDate.of(2020, 12, 12));
		Device[] hoanglocItem= new Device[] {Devices[0],Devices[1]};
		ItemDetail hoangLocBillDetail = new ItemDetail(customers[0],hoanglocItem,LocalDate.of(2020, 12, 13));
		double leNaBill = getBill(hoangLocBillDetail);
		double hoanglocBill=getBill(leNaBillDetail);
		System.out.println("bill le na"+StringUtil.format(leNaBill));
		System.out.println(hoanglocBill);

	}       



	

	/// khoi tao du lieu cho thiet bi
	private static Device[] getDevice() {
		return new Device[] { new Device("nokia", "androi", "black", 500), new Device("iphone", "IOS", "while", 600),
				new Device("nokia2", "androi", "black", 700), new Device("nokia3", "androi", "black", 800),

		};
	}

///khoi tao du lieu cho khac hang
	private static Customer[] getCustomers() {
		return new Customer[] { new Customer("lena", "0905", "123", "da nang"),
				new Customer("leteo", "0169", "456", "da nang"), };
	}

}
