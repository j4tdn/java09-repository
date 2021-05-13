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
		ItemGroup igA = new ItemGroup(18,"Túi xách");
		// itemGroupService.save(igA);
		
		ItemGroup igB = new ItemGroup(19,"Tất");
		Item itB2 = new Item(16, "itB2", "Đỏ","Da", 550d, 250d, igA);
		itemService.save(itB2);
		//insert item -> cascade all with ItemSize
		// session.get(ItemSize#id)
		//mapping 1-n n-1 :ItemSize Size
	}
}
	