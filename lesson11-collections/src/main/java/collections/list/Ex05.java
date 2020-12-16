package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import collections.utils.CollectionUtils;
import static collections.utils.CollectionUtils.*;

import collections.utils.CollectionUtils;

public class Ex05 {
	public static void main(String[] args) {
		List<Integer>  firstIds = Arrays.asList(1,2,3,4,5);	
		List<Integer>  secondIds = Arrays.asList(1,2,3,4,5);
		List<Integer> addAll = new ArrayList<Integer>(firstIds);
		addAll.addAll(secondIds);
		List<Integer> removeAll = new ArrayList<Integer>(firstIds);
		removeAll.remove(secondIds);
		List<Integer> retainAll = new ArrayList<Integer>(firstIds);
		retainAll.retainAll(secondIds);
		printf(addAll);
		printf(removeAll);
		printf(retainAll);


	}

}