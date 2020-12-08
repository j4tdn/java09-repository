package collections.map;

import static java.util.Comparator.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer,String> models = new HashMap<>(); 
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Thua Thien Hue");
		models.put(null, "unknown");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		models = sort(models);
		iterate(models);
		iterateKey(models);
		iterateValue(models);
		
	}
	
	private static void iterate (Map<Integer, String> models) {
		// Entry<K,V>
		for (Entry<Integer, String> entry : models.entrySet()) {
			 System.out.println(entry);
		}
	}
	
	private static void iterateKey (Map<Integer, String> models) {
		// Entry<K,V>
		for (Integer key: models.keySet()) {
			 System.out.println(key);
		}
	}
	
	private static void iterateValue (Map<Integer, String> models) {
		// Entry<K,V>
		for (String value: models.values()) {
			 System.out.println(value);
		}
	}
	
	private static Map<Integer, String> sort(Map<Integer,String> models) {
		 // B1 : convert map to list => List<Entry<K,V>>
		 // B2 : sort List<Entry> : key, value
		 // B3 : Create a map
		 // B4 : Put sortedList 's Entry to new map
		List<Entry<Integer, String>> sortedList = new LinkedList<>(models.entrySet());
		sortedList.sort(new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				Integer k1 = o1.getKey();
				Integer k2 = o2.getKey();
				if (k1 == null) {
					return -1;
				}
				
				if (k2 == null) {
					return 1;
				}
				return k1 - k2;
			}
		});
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
}
