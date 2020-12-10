package collection.map;

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

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		// TreeMap: sort By Key

		Map<Integer, String> models = new HashMap<Integer, String>();
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Hue");
		 models.put(null, "unknow");
		models.put(73, "Quang Binh");
		models.put(74, "Quang Tri");

		Map<Integer, String>sotedMap = sort(models);

		iterate(sotedMap);
		iterateKey(sotedMap);
		iterateValues(sotedMap);
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

	private static void iterateValues(Map<Integer, String> models) {

		for (String values : models.values()) {
			System.out.println(values);
		}
	}

	private static Map sort(Map<Integer, String> models) {
		// covert Map to List => List<Entry<K, V>>
		// sort List<Entry> Key or Values
		// create a Map => Map (K ,V>
		// Put sortedMap 's entry to newMap
		List<Entry<Integer, String>> sortedList = new LinkedList<>(models.entrySet());
		sortedList.sort(nullsFirst(comparing(e->e.getValue())));
		
		sortedList.sort((new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
				Integer k1 = e1.getKey();
				Integer k2 = e2.getKey();
				
				
				if (k1==null) {
					return -1;
				}
				if(k2==null) {
					return 1;
				}
				return k1-k2;
				
				
			}
			
		}));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for ( Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
		
	}
}
