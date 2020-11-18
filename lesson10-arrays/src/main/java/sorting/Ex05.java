package sorting;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import static java.util.Comparator.*;

public class Ex05 {
	public static void main(String[] args) {
		;
		Item[] items = getItems();
		// default sort for E[]
		// require: E is subclass of Comparable
		// sort: Comparable: is default sort // comparator

		Comparator<Item> comp = comparing(item -> item.getId());
		Arrays.sort(items, comp.thenComparing(item -> item.getName()));
		prinf(items);

	}

	private static void prinf(Item[] items) {
		for (Item item : items) {
			System.out.println(item);
		}
	}

	private static Item[] getItems() {
		return new Item[] { 
				new Item(1, "A"),
				new Item(7, "D"),
				new Item(5, "C"), 
				new Item(5, "B"), 
				new Item(3, "E"), };
	}
}
