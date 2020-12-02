package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import collections.utils.ListUtils;
import static collections.utils.ListUtils.*;

import collections.utils.ListUtils;

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
		printf(addAll);//hợp
		printf(removeAll);// hieu
		printf(retainAll);// giao
		List<Object> list = Arrays.asList(" " );
		printfwc(list);


	}
	
}
