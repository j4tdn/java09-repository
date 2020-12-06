package collections.list;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static collections.utils.CollectionUtils.*;


public class Ex05 {
	public static void main(String[] args) {
		List firstIds=Arrays.asList(1,2,3,4,5);
		List secondIds=Arrays.asList(4,5,6,7,8,9);
		
		//firstIds.addAll(secondIds);
		List<Integer> addAll = new ArrayList<>(firstIds);
		addAll.addAll(secondIds);
		
		List<Integer> removeAll = new ArrayList<>(firstIds);
		removeAll.removeAll(secondIds);
		
		List<Integer> retainAll = new ArrayList<>(firstIds);
		retainAll.retainAll(secondIds);
		
		
		printf(addAll);// Hợp
		printf(removeAll); // Hiệu
		printf(retainAll); //Giao
		
		List<Object>list=Arrays.asList("");
		printfwc(list);
	}
}
