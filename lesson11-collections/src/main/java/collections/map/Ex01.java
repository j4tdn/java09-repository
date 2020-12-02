package collections.map;

import static java.util.Comparator.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.function.Function;

public class Ex01 {
	public static void main(String[] args) {
		//Map<Integer, String> models = new TreeMap<>(nullsFirst(reverseOrder()));
		Map<Integer, String> models = new HashMap<>();
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Thua Thien Hue");
		models.put(null, "unknown");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		
		iterate(models);
		iterateKeys(models);
		iterateValues(models);
		
		Map<Integer, String> sortedMap = sort(models);
		iterate(sortedMap);
	}
	
	private static void iterate(Map<Integer, String> models) {
		//Entry<K, V>
		for (Entry<Integer, String> entry: models.entrySet()) {
			System.out.println(entry);
		}
	}
	
	private static void iterateKeys(Map<Integer, String> models) {
		for (Integer key: models.keySet()) {
			System.out.println(key);
		}
	}
	
	private static void iterateValues(Map<Integer, String> models) {
		for (String value: models.values()) {
			System.out.println(value);
		}
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> models) {
		//B1: Convert MAP to List => List<Entry<K,V>>
		//B2: Sort List<Entry> Key, Value
		//B3: Create a MAP => Map<K,V>
		//b4: Put sortedList's entry to newMap
		
		List<Entry<Integer, String>> sortedList = new LinkedList<>(models.entrySet());
		sortedList.sort(nullsFirst(comparing(e -> e.getValue())));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
