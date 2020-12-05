package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sound.sampled.ReverbType;

import java.util.TreeMap;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> models=new HashMap<>();
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "thua Thien Hue");
		//models.put(null, "unknow");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		sort(models);
		iterateKey(models);
		
	}
	private static Map<Integer, String> sort(Map<Integer, String> models) {
		// B1: Convert MAP to List => List<Entry<K, V>>
		// B2: Sort List<Entry> Key, Value
		// B3: Create a MAP => Map<K, V>
		// B4: Put sortedList's Entry to newMap
		List<Entry<Integer, String>> sortedList = new LinkedList<>(models.entrySet());
		sortedList.sort(nullsFirst(comparing(e -> e.getValue())));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}		
		return sortedMap;
	}
	private static void iterate(Map<Integer,String> models) {
		// Entry<K,V>
		for(Entry<Integer, String> entry:models.entrySet()) {
			System.out.println(entry.getValue());
		}
	}
	private static void iterateKey(Map<Integer,String> models) {
		// Entry<K,V>
		for(Integer key:models.keySet()) {
			System.out.println(key);
		}
	}
	private static void iterateValue(Map<Integer,String> models) {
		// Entry<K,V>
		for(String value: models.values()) {
			System.out.println(value);
		}
	}
	
}
