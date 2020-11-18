package sorting;

import util.ArraysUtils;

public class Ex01 {
public static void main(String[] args) {
	int [] numbers= {1,5,9,4,2,1,11};
	bubbleSort(numbers);
	ArraysUtils.printf(numbers);
}
public static void bubbleSort(int []numbers)
{
	for (int out=numbers.length-1;out>0;out--) {
		for (int in=0;in<out;in++)
		{
			if (numbers[in]<numbers[out])
			{
				int tmp=numbers[in];
				numbers[in]=numbers[out];
				numbers[out]=tmp;
			}
		}
	}
}
}
