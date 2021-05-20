package demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImp;
import service.ItemService;
import service.ItemServiceImp;

public class App {
	
	private static ItemGroupService itemGroupService;
	private static ItemService itemService;
	
	static {
		itemGroupService = new ItemGroupServiceImp();
		itemService = new ItemServiceImp();
	}
	
	public static void main(String[] args) {
		//Cau 1
		String date = "18/12/2020";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.parse(date, dtf);
		List<ItemDto> itemDtos = itemService.getItemDtos(localDate);
		for (ItemDto itemDto:itemDtos) {
			System.out.println(itemDto);
		}
		
		//Cau 2
		List<ItemGroupDto> itemGroupDtos = itemGroupService.getItemGroupDtos();
		for (ItemGroupDto itemGroupDto:itemGroupDtos) {
			System.out.println(itemGroupDto);
		}
		
//		//Cau 3
//		System.out.println(itemService.getItemsByAmount(2020));
	}
	
}
