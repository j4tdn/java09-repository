package collections.map;

import java.util.Comparator;
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
		Map<Integer, String> models = new HashMap<Integer, String>();
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(null, "unknow");
		models.put(75, "Thua Thien Hue");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		iterate(models);
		iterateKey(models);
		iterateValue(models);
		
		System.out.println("===============");
		
		Map<Integer, String> sortedMap = sort(models);
		iterate(sortedMap);
		iterateKey(sortedMap);
	}

	private static Map<Integer, String> sort(Map<Integer, String> models) {
		// b1: convert MAP to List => List<Entry<K , V>>
		// b2: Sort List<Entry> Key, Value

		// b3: create a MAP => Map<k, V>
		// b4:Put sortedList's entry to newMap
		List<java.util.Map.Entry<Integer, String>> sortedList = new LinkedList<>(models.entrySet());
		sortedList.sort(new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
				Integer k1 = e1.getKey();
				Integer k2 = e2.getKey();
				
				if(k1 == null) {
					return -1;
				}
				if(k2 == null) {
					return 1;
				}
				return k1-k2;
			}
		});
		sortedList.sort(comparing(entry -> entry.getValue()));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (java.util.Map.Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	private static void iterate(Map<Integer, String> models) {
		// Emtry<K, V>
		for (java.util.Map.Entry<Integer, String> entry : models.entrySet()) {
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
