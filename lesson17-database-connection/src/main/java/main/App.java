package main;

import java.util.List;
import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.itemGroupDao;
import persistence.Employee;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class App {
	private static itemGroupDao itemGroupDao ;
	private static ItemDao itemDao ;
	private static EmployeeDao empDao ;
	static{
		itemGroupDao = new itemGroupDao();
		itemDao = new ItemDao();
		empDao = new EmployeeDao();
	}
	
	public static void main(String[] args) {
	//	List<ItemGroup> itemGrAll =  itemGroupDao.getAll();
	//	show(itemGrAll);
		System.out.println("============");
	//	List<Item> items = itemDao.getItems(1, 100, 500);
	//	show(items);
		System.out.println("============");
	//	List<Item> itemsByIgrName = itemDao.getItems("Quần");
	//	show(itemsByIgrName);
		System.out.println("============");
		List<ItemGroupDto> igrDetail = itemGroupDao.getItemGruopDetail();
		show(igrDetail);
		System.out.println("============");
		String pass = "12345";
		System.out.println("MD5:" + DigestUtils.md5Hex(pass));
		System.out.println("============");
		Scanner ip = new Scanner(System.in);
		while(true) {
			System.out.println("Username:");
			String username = ip.nextLine();
			
			System.out.println("password:");
			String password = ip.nextLine();
			
			empDao.login(username, password)
			.ifPresent(System.out::println);
	}
}
	private static <E> void show (List<E> es) {
		for(E e:es) {
			System.out.println(e);
		}
	}
}
