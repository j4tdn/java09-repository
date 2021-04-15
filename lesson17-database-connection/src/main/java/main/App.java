package main;

import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.ItemGroupDtoDao;
import dto.ItemGroupDto;
import persistence.Item;
import persistence.ItemGroup;

public class App {
	private static ItemGroupDao itemGroupDao; 
	private static ItemDao itemDao;
	private static ItemGroupDtoDao igrDtoDao;
	static {
		itemGroupDao = new ItemGroupDao();
		itemDao = new ItemDao();
		igrDtoDao = new ItemGroupDtoDao();
		}
	public static void main(String[] args) {
		List<ItemGroup> itemGroup =	itemGroupDao.getAll();
		show(itemGroup);
		List<Item> items = itemDao.getItems(1, 100, 500);
		show(items);
		System.out.println("=========================");
		List<Item> items2 = itemDao.getItems3("Quần", 100, 500);
		show(items2);
		System.out.println("=========================");

		List<ItemGroupDto> igrDtoAll = igrDtoDao.getIgrDto();
		show(igrDtoAll);
	}
	private static <E> void show(List<E> es) {
		for (E e:es) {
			System.out.println(e);
		}
		
	}
}
