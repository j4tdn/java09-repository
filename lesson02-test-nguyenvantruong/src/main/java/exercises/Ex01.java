package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
	int	a[] = {14,5,5,4,6,7,1};
	int result[]= unitqueNumbers(a);
	for(int i=0;i<result.length;i++) {
		System.out.println(result[i]);
	}
	
	}
	private static int[] unitqueNumbers(int[] a) {
		int[] result= new int[a.length];
		int index=0;
		for (int i = 0; i < a.length; i++){
			int current = a[i];
				if (isUnique(current,a,i)){
					result[index++]=current;
				}
			}
		
		return Arrays.copyOfRange(result, 0, index);
		}
	private static boolean isUnique(int current, int[] a, int currentIndex) {
			for (int i=0; i< a.length;i++) {
				if(i!=currentIndex && a[i] == current) {
					return false;
				}
			}
		return true;
	}
		
	}

