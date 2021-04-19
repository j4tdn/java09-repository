package main;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.codec.digest.DigestUtils;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import persistence.Employee;
import persistence.ItemGroupDto;
import persistence.ItemGroupDto2;

public class App {
	static ItemGroupDao itemGroupDao;
	static ItemDao itemDao;
	static EmployeeDao employeeDao;
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao=new ItemDao();
		employeeDao=new EmployeeDao();
	}

	public static void main(String[] args) {
	// List<ItemGroup> itemGroupAll=itemGroupDao.getAll();
	
//	List<Item> items=itemDao.getItems(1, 100, 300);
//	List<Item> item=itemDao.getItem("Áo");
	List<ItemGroupDto> list=itemGroupDao.getItemGrpDto();
//	show(list);
	System.out.println("==========================");
	
	List<ItemGroupDto2> list2=itemGroupDao.getItemGrpDto2();
//	show(list2);
	Map<Integer, List<ItemGroupDto2>> result = list2.stream()
		    .collect(Collectors.groupingBy(ItemGroupDto2::getIgrId));
	result.entrySet().stream().forEach(System.out::println);
	System.out.println("==========================");

	String pas="12345";
	System.out.println("md5= "+DigestUtils.md5Hex(pas));
	System.out.println("==========================");
	Scanner ip=new Scanner(System.in);
	
	while(true) {
		System.out.println("nhap user name");
		String username=ip.nextLine();
		System.out.println("nhap password");
		String password=ip.nextLine();
		employeeDao.login(username, password).ifPresent(System.out::print);
//	if(emp.isPresent()) {
//		System.out.println(emp.get());
//		break;
//	}else {
//		System.out.println("wrong user/pass");
//	}
		
	}
	
	
	
}

	private static <E> void show(List<E> es) {
		for(E e:es) {
			System.out.println(e);
		}
	}
}
