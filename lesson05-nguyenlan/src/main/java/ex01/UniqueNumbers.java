package ex01;

public class UniqueNumbers {

	public static int[] getUniqueNumbers(int arr[]) {
		int a[] = new int[arr.length];
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					break;
				}
			}
			a[count] = a[i];
			count++;
		}
		return a;	
	}
	public static void main(String[] args) {
		int a[] = {1, 0, 1, 3, 7, 9, 2, 10, 7};
		getUniqueNumbers(a);
		
	}
}
