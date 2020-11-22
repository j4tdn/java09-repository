package sorting;

import java.util.Arrays;
import java.util.Comparator;

import bean.Item;
import static java.util.Comparator.*;
public class Ex05 {
	public static void main(String[] args) {
		Item[] items = getItems();
		//defalt sort for E[] 
		//require: E is subclass/child of Comparable (implements Comparable<E>
		//Arrays.sort(items, comparing(item->item.getName(), reverseOrder()));  => sắp xếp theo tên giảm dần
		
		
		Comparator<Item> comp = comparing(item -> item.getId());
		
		Arrays.sort(items,comp.thenComparing(item -> item.getName()));
		printf(items);
	}
	
	private static Item[] getItems() {
		
		return new Item[] {
				new Item(1, "A"),
				new Item(7, "D"),
				new Item(3, "C"),
				new Item(2, "F"),
				new Item(3, "B"),
				new Item(5, "K"),
		};
		
	}
	
	private static void printf(Item[] items) {
		for(Item item:items) {
			System.out.println(item);
		}
		System.out.println();
	}
}
