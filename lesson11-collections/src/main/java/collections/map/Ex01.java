package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;

import static java.util.Comparator.*;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> models = new HashMap<>();
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Thua Thien Hue");
		// models.put(null, "unknown");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		
		Map<Integer, String> sortedMap =  sort(models);
		
		interate(models);
		interateKey(models);
		interateValue(models);
		interate(sortedMap);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> models) {
		// B1: Convert MAP to List => List<Entry<K, V>>
		// B2: sort List<Entry> Key, Value
		// B3: Create a MAP => MAP<K, V>
		// B4: Put sortedList's entry to newMap
		List<Entry<Integer, String>> sortedList = new LinkedList<>(models.entrySet());
		sortedList.sort(nullsFirst(comparing(e -> e.getValue())));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
		
	}

	private static void interate(Map<Integer, String> models) {
		// Entry<K, V>
		for (Entry<Integer, String> entry : models.entrySet()) {
			System.out.println(entry);
		}
	}
	
	private static void interateKey(Map<Integer, String> models) {
		// Entry<K, V>
		for (Integer key : models.keySet()) {
			System.out.println(key);
		}
	}
	
	private static void interateValue(Map<Integer, String> models) {
		// Entry<K, V>
		for (String value : models.values()) {
			System.out.println(value);
		}
	}
}
