package sorting;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import static java.util.Comparator.*;

public class Ex05 {
	public static void main(String[] args) {
		Item[] items = getItems();
		// default sort for E[]
		// require :E is subclass of comparable
		// sort:comparable, comparator
		// Arrays.sort(items);
		Comparator<Item> comp= comparing(item -> item.getId());
		Arrays.sort(items,comp.thenComparing(item ->item.getName()));
		printf(items);

	}

	private static Item[] getItems() {
		return new Item[] { new Item(1, "A"), new Item(7, "D"), new Item(2, "C"), new Item(3, "E"), new Item(3, "B")

		};
	}

	private static void printf(Item[] items) {
		for (Item item : items) {
			System.out.println(item);
		}
	}
}
