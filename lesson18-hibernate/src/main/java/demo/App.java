package demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import persitence.Item;
import persitence.ItemDto;
import persitence.ItemGroup;
import persitence.Size;
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
		itemService.getFirstlevelCacheTwoSessions(1);
	}
}
	