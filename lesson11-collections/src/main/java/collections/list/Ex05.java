package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import collections.utils.ListUtil;
import collections.utils.ListUtils;

import static collections.utils.ListUtil.*;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer> firtsIDs = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> secondIDs = Arrays.asList(4, 5, 6, 7, 8);

		List<Integer> addAll = new ArrayList<>(firtsIDs);
		addAll.addAll(secondIDs);

		List<Integer> removeAll = new ArrayList<>(firtsIDs);
		removeAll.removeAll(secondIDs);

		List<Integer> retainAll = new ArrayList<>(firtsIDs);
		retainAll.retainAll(secondIDs);

		ListUtils.printf(addAll);
		System.out.println("=====");
		ListUtils.printf(removeAll);
		System.out.println("=====");
		ListUtils.printf(retainAll);
	}
}