package main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class App {
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	private static EmployeeDao empDao;
	
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
		empDao = new EmployeeDao();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGrpAll = itemGroupDao.getAll();
		show(itemGrpAll);
		System.out.println("=======================");
		List<Item> items = itemDao.getItems(1, 100, 500);
		show(items);
		System.out.println("=======================");
		List<Item> items1 = itemDao.getItems("Áo");
		show(items1);
		System.out.println("=======================");
		List<ItemGroupDto> itemGrpDtoAll = itemGroupDao.getItemGrpDetails();
		show(itemGrpDtoAll);
		
		String pass = "12345";
		System.out.println("MD5: " + DigestUtils.md5Hex(pass));
		
		System.out.println("=======================");
		
//		if(empDao.login("com2.default.tp@gmail.com", "23456") != null) {
//			System.out.println("User: " + empDao.login("com2.default.tp@gmail.com", "23456"));
//		} else {
//			System.out.println("Wrong user/pass");
//			System.out.println("User: " + empDao.login("com2.default.tp@gmail.com", "23456"));
//		}
		empDao.login("com2.default.tp@gmail.com", "23456").ifPresent(System.out::println);
		
//		List<Item> itemsBySale = itemDao.getItemsBySale();
//		show(itemsBySale);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//		LocalDateTime dateTime = LocalDateTime.parse("2020-12-18 16:33:20", formatter);
//		List<Item> itemsSaleDate = itemDao.getItems(dateTime);
//		show(itemsSaleDate);
//		System.out.println(dateTime.toString());
		
//		String pathName = "G:\\JAVA09\\workspace\\Javacore\\java09-repository\\lesson17-database-connection\\loaihang.txt";
//		Path path = Paths.get(pathName);
//		itemGroupDao.insertItemGroup(path);
	}
	
	private static <E> void show(List<E> es) {
		for (E e : es) {
			System.out.println(e);
		}
	}
}
