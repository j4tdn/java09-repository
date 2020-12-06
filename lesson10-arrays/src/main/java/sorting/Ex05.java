package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import static java.util.Comparator.*;

public class Ex05 {
	public static void main(String[] args) {
		Item[] items = getItems();
		// default sort for E[]
		// require: E is subclass of Comparable
		// sort: Comparable, Comparator
		
		Comparator<Item> comp = comparing(item -> item.getId());
		Arrays.sort(items, comp.thenComparing(item -> item.getName()));
		printf(items);
		
		// Comparable versus Comparator
		
		// primitive type: auto ascending
		Arrays.sort(new int[] {});
		
		// object type: sort elements
		// Type: E
		// required: E is child of Comparable
		Arrays.sort(items);
		
		Arrays.sort(items, comparing(item -> item.getName(), reverseOrder()));
		Arrays.sort(items, comparing(item -> item.getId(), reverseOrder()));
		
		
	}
	
	private static void printf(Item[] items) {
		for(Item item: items) {
			System.out.println(item);
		}
	}
	
	private static Item[] getItems() {
		return new Item[] {
			new Item(1, "A"),
			new Item(7, "D"),
			new Item(2, "C"),
			new Item(5, "E"),
			new Item(5, "B"),
		};
	}
}
