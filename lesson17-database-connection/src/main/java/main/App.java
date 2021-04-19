package main;

import java.util.List;
import java.util.Scanner;

import dao.EmployeeDao;
import dao.ItemDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.Employee;

public class App {
	private static ItemGroupDao itemGroupDao = new ItemGroupDao();
	private static ItemDao itemDao;
	private static EmployeeDao employeeDao = new EmployeeDao();
	
	public static void main(String[] args) {
//		System.out.println("===========================");
//		List<ItemGroup> itemGroups = itemGroupDao.getAll();
//		show(itemGroups);
//		System.out.println("===========================");
//		List<ItemGroup> itemGroupsById = itemGroupDao.getAllById();
//		show(itemGroupsById);
//		System.out.println("===========================");
//		List<ItemGroup> itemGroupsByName = itemGroupDao.getAllByName();
//		show(itemGroupsByName);
		System.out.println("===========================");
		List<ItemGroupDto> itemGroups = itemGroupDao.getItems();
		show(itemGroups);
		System.out.println("===========================");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Username: ");
			String username = sc.nextLine();
			
			System.out.print("Password: ");
			String password = sc.nextLine();
			
			Employee emp = employeeDao.login(username, password);
			if (emp != null) {
				System.out.println("UserInfo: " + emp);
				break;
			} else {
				System.out.println("Wrong username/password");
			}
		}
		
	}
	
	private static <E> void show(List<E> elements) {
		for(E e : elements) {
			System.out.println(e);
		}
	}
}
