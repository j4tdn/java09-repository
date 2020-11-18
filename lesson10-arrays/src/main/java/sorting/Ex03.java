package sorting;

import java.util.Arrays;

import static utils.ArrayUtils.*;

public class Ex03 {
	public static void main(String[] args) {
		String[] sequences = {"a", "c", "bbb", "ahihi", null, "5f", "$llll"};
		
		Arrays.sort(sequences, (o1, o2) -> o1.compareTo(o2));
		println(sequences);
	}
}
