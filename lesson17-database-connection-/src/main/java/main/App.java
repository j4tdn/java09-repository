package main;

import java.util.List;
import java.util.Scanner;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.Employee;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	private static EmployeeDao employeeDao;
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
		employeeDao = new EmployeeDao();
	}
	public static void main(String[] args) {
		List<ItemGroup> itemGrpAll = itemGroupDao.getAll();
		List<Item>  items = itemDao.getItem(2, 100, 500);
		show(items);
		
		System.out.println("=========================");
		List<Item> itemsByIgrName = itemDao.getItemByName("Quần");
		show(itemsByIgrName);
		
		System.out.println("=========================");
		List<ItemGroupDto> itemGroupDtos = itemGroupDao.getItemGroupDetail();
		show(itemGroupDtos);
		
		System.out.println("=========================");
		Scanner ip = new Scanner(System.in);
		
		while (true) {
			System.out.print("Username:");
			String username = ip.nextLine();
			System.out.print("Password:");
			String password = ip.nextLine();
			employeeDao.login(username, password).ifPresent(System.out::println);		
		}
	}
	
	private static <E> void show (List<E> elements) {
		for (E e : elements) {
			System.out.println(e);
		}
	}
}
