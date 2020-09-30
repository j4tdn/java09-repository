package exercises;

public class Ex01 {
	public static void main(String[] args) {
		int[] listNumber = {3, 15, 21, 0, 15, 17, 21, 15, 15, 15, 15, 15};
		int[] result = getUniqueNumbers(listNumber);
		for(int i =0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static int[] getUniqueNumbers(int[] listNumber) {
		int total = 0;
		int tmpElement = 0;
		for(int i = 0; i< listNumber.length; i++) {
			int count = 0;
			tmpElement = listNumber[i];
			for(int j = 0; j < listNumber.length; j++) {
				if(tmpElement == listNumber[j]) {
					count++;
				}
			}
			if(count == 1) {
				total++;
			}
		}
		int[] array = new int[total];
		int x=0;
		for(int i = 0; i < listNumber.length; i++) {
			int count = 0;
			tmpElement = listNumber[i];
			for(int j = 0; j < listNumber.length; j++) {
				if(tmpElement == listNumber[j]) {
					count++;
				}
			}
			if(count == 1) {
				array[x] = listNumber[i];
				x++;
			}
		}
		return array;
	}
	
}
