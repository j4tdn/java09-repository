package view;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;


import lesson03_OOP.ItemDetail;
import util.ItemDetaileUtils;
import util.StringUtil;


public class ShopDemo {
	public static void main(String[] args) {
		Item[] items=getItem();
		//tạo đối tượng customers- khách hàng		
		Customer[]customers =getCustomers();
		
		//tạo đối tượng  locItems chứa thiết bị đã mua
		Item[] locItems=new Item[] {items[0], items[1]};
		//tạo đối tượng hoangLocBill gồm cso khách hàng,
		ItemDetail hoangLocBillDetail=new ItemDetail(customers[0], locItems, LocalDate.of(2020, 06, 30));
		
		Item[] linhItems= new Item[] {items[3]};
		ItemDetail linhBillDetail=new ItemDetail(customers[1], linhItems, LocalDate.of(2020, 06, 05));
		
		//tinh tien
		double hoangLocBill=ItemDetaileUtils.getBill(hoangLocBillDetail);
		double hoanglinhBill=ItemDetaileUtils.getBill(linhBillDetail);
		System.out.println(StringUtil.format(hoangLocBill));
		System.out.println(StringUtil.format(hoanglinhBill));
	}       

///tạo hàm tính tiền

	

	/// khoi tao du lieu cho thiet bi
	private static Item[] getItem() {
		return new Item[] { 
				new Item("nokia", "androi", "black", 9000000),
				new Item("iphone", "IOS", "while", 6000000),
				new Item("nokia2", "androi", "black", 7000000),
				new Item("nokia3", "androi", "black", 8000000),

		};
	}

///khoi tao du lieu cho khac hang
	private static Customer[] getCustomers() {
		return new Customer[] { 
				new Customer("hoangloc", "0905", "123", "da nang"),
				new Customer("hoanglinh", "0169", "456", "da nang"), 
				};
	}

}
