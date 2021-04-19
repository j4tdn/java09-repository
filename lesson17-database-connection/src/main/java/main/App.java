package main;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.OrderDao;
import persistence.Employee;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class App {
	private static ItemGroupDao itemGroupDao;
	private static ItemDao itemDao;
	private static OrderDao orderDao;
	private static EmployeeDao empDao;
	
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
		orderDao = new OrderDao();
		empDao = new EmployeeDao();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> itemGrpAll = itemGroupDao.getAll();
		show(itemGrpAll);
		
		System.out.println("=======================");
		
		List<Item> itemByCost = itemDao.getItems(1, 100, 500);
		show(itemByCost);
		
		System.out.println("=======================");
		
		List<Item> items = itemDao.getItems("Ã�o");
		show(itemByCost);
		
		System.out.println("=======================");
		
		List<ItemGroupDto> igrDetails = itemGroupDao.getItemDetails();
		show(igrDetails);
		
		System.out.println("==========");
		String pass = "12345";
		System.out.println("MD5: " + DigestUtils.md5Hex(pass));
		System.out.println("=======================");

		Scanner ip = new Scanner(System.in);
		System.out.println("username: ");
		String username = ip.nextLine();
		System.out.println("password:");
		String password = ip.nextLine();
		while(true) {
			empDao.login(username, password).ifPresent(System.out::println);
		

	}
	}
	
	private static <E> void show(List<E> es) {
		for(E e: es) {
			System.out.println(e);
		}
	}
}
