package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static collection.utils.ListUtils.*;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer> firstIds = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> secondtIds = Arrays.asList(4, 5, 6, 7, 8);
		List<Integer> addAll = new ArrayList<Integer>(firstIds);
		addAll.addAll(secondtIds);
		List<Integer> removeAll = new ArrayList<Integer>(firstIds);
		removeAll.removeAll(secondtIds);
		List<Integer> retainAll = new ArrayList<Integer>(firstIds);
		retainAll.retainAll(secondtIds);
		printf(addAll);// Hợp
		printf(removeAll);// Hiệu
		printf(retainAll);// Giao

	}
}
