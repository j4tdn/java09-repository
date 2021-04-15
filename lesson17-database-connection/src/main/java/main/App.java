package main;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.OrderDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

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
		
		List<ItemGroupDto> igrDetails = itemGroupDao.getItemDetails();
		show(igrDetails);
		
		System.out.println("==========");
		String pass = "12345";
		System.out.println("MD5: " + DigestUtils.md5Hex(pass));
	}
	
	private static <E> void show(List<E> es) {
		for(E e: es) {
			System.out.println(e);
		}
	}
}
