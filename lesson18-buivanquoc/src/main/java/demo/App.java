package demo;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceIpml;
import service.ItemService;
import service.ItemServiceIpml;

public class App {
	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	static 
	{
	itemService= new ItemServiceIpml();
itemGroupService= new ItemGroupServiceIpml();		
	}
public static void main(String[] args) {
//	Ex01
//	LocalDate saleDate = LocalDate.now();
//	List<ItemDto> items = itemService.getitemsSaleDate(saleDate);
//	items.forEach(System.out::println);

//  Ex02
//	List<ItemGroupDto> itemGroupDtos=itemGroupService.getItemGroupDto();
//	itemGroupDtos.forEach(System.out::println);
	
//	Ex03
//	List<String> top3items=itemService.getTop3Items(2020);
//	for(String top3:top3items)
//	{
//		System.out.println(top3);
//	}
	
//	Ex04
//	List<Item> item=itemService.getItem();
//	item.forEach(System.out::println);
	}
}

