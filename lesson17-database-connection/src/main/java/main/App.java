package main;

import java.time.LocalDateTime;
import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.OrderDao;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	private static OrderDao orderDao;
	
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
		orderDao = new OrderDao();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGrpAll = itemGroupDao.getAll();
		show(itemGrpAll);
		
		System.out.println("=======================");
		
		List<Item> itemByCost = itemDao.getItems(1, 100, 500);
		show(itemByCost);
		
		System.out.println("=======================");
		
		List<Item> items = itemDao.getItems("Áo");
		show(itemByCost);
		
		System.out.println("=======================");
		
//		List<ItemGroup> itGr = itemGroupDao.calStock();
//		show(itGr);
//		System.out.println("Tổng số lượng: " + itemGroupDao.sumStock());
//		
//		System.out.println("========================");
//		System.out.println("Tổng tiền của đơn hàng 1: " + orderDao.getTotalOfMoney(1));
//		
//		System.out.println("========================");
//		System.out.println("Các mặt hàng được bán trong ngày 18-12-2020:");
//		LocalDateTime dt = LocalDateTime.of(2020, 12, 18, 2, 20);
//		show(itemDao.getItems(dt));
//		
//		itemGroupDao.insert();
	}
	
	private static <E> void show(List<E> es) {
		for(E e: es) {
			System.out.println(e);
		}
	}
}
