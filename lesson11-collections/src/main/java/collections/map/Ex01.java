package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import static java.util.Comparator.*;

import javax.swing.SortOrder;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, String> models = new  HashMap<>();
		
		models.put(43, "Da Nang");
		models.put(75, "Hue");
		models.put(92, "Quang Nam");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		models.put(null,"unknow");
		Map<Integer, String> sortedMap = sort(models);
		System.out.println(sortedMap);
		
		iterate(models);
		iterateKeys(models);
		iterateValues(models);
		
	}
	private static Map<Integer, String> sort(Map<Integer, String> models) {
		//b1 convert ,ap to list => list<entry>
		//b2: sprt list<entry> key ,value
		//b3: create a map => map (k,v)
		//b1: put sortedlist's entry to new map
		List<Entry<Integer, String>> sortedList= new LinkedList<>(models.entrySet());
		sortedList.sort(new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
				// TODO Auto-generated method stub
				Integer k1 = e1.getKey();
				Integer k2 = e2.getKey();
				// null first , ascending by key
				if(k1==null) {
					return -1;
				}
				if(k2==null) {
					return 1;
				}
				return k1-k1;
				
			}
		});
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer,String> entry:sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	private static void iterate(Map<Integer, String> models) {
		for (Entry<Integer, String> entry : models.entrySet()) {
			System.out.println(entry);

		}

	}

	private static void iterateKeys(Map<Integer, String> models) {
		for (Integer key : models.keySet()) {
			System.out.println(key);

		}
	}
	private static void iterateValues(Map<Integer, String> models) {
		for (String value : models.values()) {
			System.out.println(value);

		}

	}

}
