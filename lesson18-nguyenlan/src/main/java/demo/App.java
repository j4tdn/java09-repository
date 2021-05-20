package demo;

import java.util.List;

import dto.ItemGroupDto;
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
		
		List<ItemGroupDto> listItemGroupDto =  itemGroupService.getItemGroupDtos();
		listItemGroupDto.forEach(System.out::println);

	}
}
