package sorting;
import utils.ArraysUtils;
import static utils.ArraysUtils.*;



public class Ex02 {
	public static void main(String[] args) {
		String[] sequences= {"a","1","7",null,"c","b","k"};
		ArraysUtils.bubbleSort(sequences);
		print(sequences);
	}
}
