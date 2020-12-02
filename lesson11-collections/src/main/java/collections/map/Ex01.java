package collections.map;

import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> model = new HashMap<>();
		model.put(92, "quang nam");
		model.put(43, "da nang");
		model.put(75, "hue");
		model.put(51, "sai gon");
		model.put(null, "unk");

		sort(model);
		Map<Integer, String> sortedMap=sort(model);
		iterate(model);
		System.out.println("=====");
		iterateKey(model);
		System.out.println("=====");
		iterateValue(model);
		System.out.println("=====");
		iterate(sortedMap);
	}

	private static Map<Integer, String> sort(Map<Integer, String> model) {
		List<Entry<Integer, String>> sortedList = new LinkedList<>(model.entrySet());
		sortedList.sort(nullsFirst(comparing(e -> e.getValue())));
		Map<Integer, String> sortedMap= new LinkedHashMap<Integer, String>();
		for(Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	private static void iterate(Map<Integer, String> models) {
		for (Entry<Integer, String> entry : models.entrySet()) {
			System.out.println(entry);
		}

	}

	private static void iterateKey(Map<Integer, String> models) {
		for (Integer key : models.keySet()) {
			System.out.println(key);
		}

	}

	private static void iterateValue(Map<Integer, String> models) {
		for (String value : models.values()) {
			System.out.println(value);
		}

	}

}
