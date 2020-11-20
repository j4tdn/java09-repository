package sorting;

import java.util.Arrays;

import bean.Item;
import utils.ArrayUtils;
import static java.util.Comparator.*;
public class Ex05 {
	public static void main(String[] args) {
		Item[] items = getItems();
		Arrays.sort(items, comparing(item -> item.getId()));
		printf(items);
	}
	
	private static Item[] getItems() {
		return new Item[] {
				new Item(1, "A"),
				new Item(2, "D"),
				new Item(6, "C"),
				new Item(9, "B"),
				new Item(3, "E"),
		};
	}
	private static void printf(Item[] items) {
		for(Item item: items) {
			System.out.println(item);
		}
	}
}
