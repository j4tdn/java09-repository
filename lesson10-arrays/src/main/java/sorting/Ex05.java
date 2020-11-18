package sorting;
import java.util.Arrays;
import bean.Item;
import static java.util.Comparator.*; 

public class Ex05 {
public static void main(String[] args) {
	Item[] item = getItems();
	Arrays.sort(item);
}
private static void printf(Item[] items) {
	for(Item item: items) {
		System.out.println(item);
	}
}
private static Item[] getItem() {
	return new Item[] {
			new Item(1, "A"),
			new Item(7, "C"),
			new Item(2, "D"),
			new Item(5, "B"),
			new Item(3, "E"),
	};
}
}
