package sorting;

import java.util.Arrays;
import java.util.Comparator;

import static utils.ArrayUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		String[] sequences = {"a","1","c","7",null,"k","5",null,"B"};
		Arrays.sort(sequences,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {// neu thang truoc lon hon thang sau , ma minh return 
				if(o1 == null) {
					return -1;
				}
				if (o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);// neu muon giam dan thi them dau tru vo
			}
		});
		printf(sequences);
	}
}
