package collection.map;

import static java.util.Comparator.*;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

public class Ex01 {
	public static void main(String[] args) {
		//TreeMap: Sort By Key
		Map<Integer, String> models = new HashMap<Integer, String>();
		models.put(92, "Quang Nam");
		models.put(43, "Da Nang");
		models.put(75, "Hue");
		models.put(null, "unknow");
		models.put(74, "Quang Tri");
		models.put(73, "Quang Binh");
		Map<Integer, String> sortedMap=sort(models);
		sort(sortedMap);
		iterate(models);
		iterateKeys(models);
		iterateValues(models);
	}
private static Map<Integer, String> sort(Map<Integer, String> models)
{    //b1: Convert MAP to List => List<Entry<k,v>>
    //b2:sort List<Entry> key,value
	//b3:create Map => Map <K,V>
	//b4:Put sortedMap's entry to newMap
	List<Entry<Integer,String>> sortedList= new LinkedList<>(models.entrySet());
	sortedList.sort(nullsFirst(comparing(e->e.getValue())));
	Map<Integer, String> sortedMap= new LinkedHashMap<>();
	for (Entry<Integer, String> entry:sortedList)
	{
		sortedMap.put(entry.getKey(), entry.getValue());
	}
	return sortedMap;
	
}
	private static void iterate(Map<Integer, String> models) {
		// entry<k,v>
		for (Entry<Integer, String> entry : models.entrySet()) {
			System.out.println(entry);
		}
	}

	private static void iterateKeys(Map<Integer, String> models) {
		// entry<k,v>
		for (Integer key : models.keySet()) {
			System.out.println(key);
		}
	}

	private static void iterateValues(Map<Integer, String> models) {
		// entry<k,v>
		for (String value : models.values()) {
			System.out.println(value);
		}
	}
}
