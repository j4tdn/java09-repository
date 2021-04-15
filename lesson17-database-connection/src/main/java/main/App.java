package main;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import dao.ItemDao;
import dao.ItemGroupDao;
import persitence.Item;
import persitence.ItemGroup;
import persitence.ItemGroupDto;


public class App {
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	static {
		itemGroupDao= new ItemGroupDao();
		itemDao = new ItemDao();
	}
	public static void main(String[] args) {
//		 List<ItemGroup> item = itemGroupDao.getTotalOfMoney(2);
//		 show(item);
		System.out.println("============");
		List<ItemGroupDto> items= itemGroupDao.getTotalOfMoney(1);
		show(items);
		
		System.out.println("=====================");
		String pass="12345";
		System.out.println("MD5: " + DigestUtils.md5Hex(pass));

		
				
	}
	private static <E> void show(List<E> es) {
		for(E e: es) {
			System.out.println(e);
		}
	}
}
