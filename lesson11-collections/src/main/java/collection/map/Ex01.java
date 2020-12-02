package collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.*;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> models = new HashMap<>();
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(null, null);
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		models = sort(models);
		
		iterate(models);
		iterateKeys(models);
		iterateValues(models);
		
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> models) {
		// B1: Convert MAP to List<Entry>
		// B2: Sort List<Entry>
		// B3: Create a MAP
		// B4: put element in list to new map
		List<Entry<Integer, String>> sortedList = new LinkedList<>(models.entrySet());
		sortedList.sort(nullsFirst(comparing(e -> e.getValue())));
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		for(Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

	private static void iterate(Map<Integer, String> models) {
		for(Entry<Integer, String> entry : models.entrySet()) {
			System.out.println(entry);
		}
	}
	
	private static void iterateKeys(Map<Integer, String> models) {
		for(Integer key : models.keySet()) {
			System.out.println(key);
		}
	}
	
	private static void iterateValues(Map<Integer, String> models) {
		for(String value : models.values()) {
			System.out.println(value);
		}
	}
}
