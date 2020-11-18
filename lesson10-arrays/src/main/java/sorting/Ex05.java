package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.*;

import bean.Item;

public class Ex05 {
	public static void main(String[] args) {
		Item[] items = getItems();
		
		Comparator<Item> com = comparing(item -> item.getId());
		Arrays.sort(items, com.thenComparing(comparing(item -> item.getName())));
		
		printf(items);
	}
	
	private static Item[] getItems() {
		return new Item[] {
			new Item(1, "D"),
			new Item(9, "KKK"),
			new Item(-91, "L"),
			new Item(8, "1B"),
			new Item(1, "ahihi"),
			new Item(91, "KP")
		};
	}
	
	private static void printf(Item[] items) {
		for(Item item : items) {
			System.out.println(item);
		}
	}
}
