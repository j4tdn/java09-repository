package sorting;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import bean.Item;

public class Ex05 {
	public static void main(String[] args) {
		Item[] items = getItems();
		Comparator<Item> comp = comparing(item -> item.getId());
		Arrays.sort(items,comp.thenComparing(item -> item.getName()));

		printf(items);
	}
	
	private static void printf(Item[] items) {
		for(Item item:items) {
			System.out.println(item);
		}
	}

	private static Item[] getItems() {
		return new Item[]{
			new Item(1,"A"),
			new Item(7,"B"),
			new Item(2,"C"),
			new Item(4,"D"),
			new Item(5,"E"),
			new Item(6,"F")
		};
	}
}
