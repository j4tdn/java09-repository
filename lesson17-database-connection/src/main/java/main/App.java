package main;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import dao.ItemDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;

	static{
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGrpAll = itemGroupDao.getAll();
		show(itemGrpAll);
		System.out.println("=========================");
		List<Item> items = itemDao.getItems(1, 100, 500);
		show(items);
		System.out.println("=========================");
		List<Item> items2 = itemDao.getItems3("Quần", 100, 500);
		show(items2);
		System.out.println("=========================");
		
		List<ItemGroupDto> igrDtoAll = itemGroupDao.getItemGrpDetails();
		show(igrDtoAll);
		
		System.out.println("====================");
		String pass = "12345";
		System.out.println("MD5: "+ DigestUtils.md5Hex(pass));
	}
	
	private static <E> void show( List<E> elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
}
