package sorting;
import static utils.ArrayUtils.*;
public class Ex02 {
	public static void main(String[] args) {
		String[] sequences= {"a","2","c",null,"k","5",null,"1","b"};
		bubbleSort(sequences);
		printf(sequences);
	}
}
