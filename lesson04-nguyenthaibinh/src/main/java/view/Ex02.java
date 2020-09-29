package view;

public class Ex02 {
	public static void main(String[] args) {
		int[] listNumber = { 2, 5, 10197824, 15, 3, 3101, 20, 35742, 203203 };
		modifyTheArray(listNumber);
		for (int number : modifyTheArray(listNumber)) {
			System.out.println(number + " ");
		}
	}

	public static boolean isDivisibleBy7(int number) {
		return number % 7 == 0 ? true : false;
	}

	public static boolean isDivisibleBy5(int number) {
		return number % 5 == 0 ? true : false;
	}

	public static int[] modifyTheArray(int[] listNumber) {
		int[] tmpArray = new int[listNumber.length];
		int count = 0;
		for (int number : listNumber) {
			if (isDivisibleBy7(number) && !isDivisibleBy5(number)) {
				tmpArray[count] = number;
				count++;
			}

		}
		for (int number : listNumber) {
			if (isDivisibleBy5(number) && isDivisibleBy7(number)
					|| !isDivisibleBy5(number) && !isDivisibleBy7(number)) {
				tmpArray[count] = number;
				count++;
			}
		}
		for (int number : listNumber) {
			if (!isDivisibleBy7(number) && isDivisibleBy5(number)) {
				tmpArray[count] = number;
				count++;
			}
		}
		return tmpArray;
	}
}
