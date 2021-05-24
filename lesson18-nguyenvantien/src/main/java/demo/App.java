package demo;

import java.time.LocalDate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("Ex01");
		LocalDate date = LocalDate.of(2020, 12, 18);
		itemService.getItemsByDate(date).forEach(System.out::println);
		System.out.println("Ex02");
		itemGroupService.getItemGroupByRemain().forEach(System.out::println);
		System.out.println("Ex03");
		itemService.getItemMostSoldInYear(2020).forEach(System.out::println);
		System.out.println("Ex03");
		itemGroupService.getAllItemGroupDetail().forEach(System.out::println);
		
	}
	
}
