package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import persistence.ItemGroupDto;
import persistence.ItemDto;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
//		//demo 1
//		LocalDate saleDate = LocalDate.now();
//		saleDate = saleDate.withDayOfMonth(18);
//		saleDate = saleDate.withMonth(12);
//		saleDate = saleDate.withYear(2020);
//		System.out.println(saleDate);
//		
//		List<ItemDto> items = itemService.getItemsBySaleDate(saleDate);
//		items.forEach(System.out::println);
		
		//demo 2
//		List<ItemGroupDto> listItemGroupDto =  itemGroupService.getItemGroupDtos();
//		listItemGroupDto.forEach(System.out::println);

		//demo 3
		List<String> top3BestSaler = itemService.getTop3BestSalerItemsInYear(2020);
		System.out.println("top3 Item best sale: ");
		top3BestSaler.forEach(System.out::println);
	}
}
