package sorting;

import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;

import javax.swing.RowFilter.ComparisonType;

import bean.Item;

public class Ex05 {
	public static void main(String[] args) {
		Item[] items=getItem();
		Arrays.sort(items,Comparator.comparing(item->item.getId()));
		print(items);
	}
	private static void print(Item[] items) {
		for(Item item:items) {
			System.out.println(item);
		}
	}
	private static Item[] getItem() {
		return new Item[] {
				new Item(1, "A"),
				new Item(3, "B"),
				new Item(2, "C"),
				
		};
	}
	
}
