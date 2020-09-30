package Bai2;

public class Ex02 {
	public static void main(String[] args) {
		int[] number = new int[] {3, 2, 1, 6, 5};
		int[] num = new int[] {3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println(getMissingNumber(num));
		System.out.println(getMissingNumber(number));
	}
	public static int getMissingNumber(int[] number) {
		int sumOfNumber = 0;
		for(int num : number) {
			sumOfNumber += num;
			
		}
		int sum =0;
		for(int i =1;i <=number.length +1;i++) {
			sum += i;
		}
		return sum - sumOfNumber;
	}
}
