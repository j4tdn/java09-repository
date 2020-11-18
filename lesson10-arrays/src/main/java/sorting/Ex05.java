package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static utils.ArrayUtils.*;
import bean.Item;
import static java.util.Comparator.*;
public class Ex05 {
	public static void main(String[] args) {
		Item[] items=getItems();
		Comparator<Item> comp=comparing(item -> item.geId());
		Arrays.sort(items,comp.thenComparing(item -> item.getName()));
		printf(items);
	}
	private static Item[] getItems() {
		return new Item[] {
				new Item(1,"A"),
				new Item(7,"B"),
				new Item(3,"D"),
				new Item(2,"C"),
		};
	}
}
