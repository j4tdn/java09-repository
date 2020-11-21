package declaration.exe;

import java.util.Arrays;
import java.util.function.Predicate;

import bean.DigitDto;

public class Ex01 {
	public static void main(String[] args) {
		int[] digits = { 1, 9, 5, 36, 12, 33 };
		// i=6,i<index=3,i--
		//	digit[6]=digit[5]
		DigitDto digitDto = getMaxMin(digits);
		int sumEven = sum(digits, t -> t % 2 == 0);

		System.out.println(sumEven);
		System.out.println(digitDto.getMax());
		System.out.println(digitDto.getMin());
		System.out.println("==============");
		int[] add= add(digits, 8, 3);
		print(add);
		System.out.println("==============");
		int[] remove=remove(digits, 3);
		System.out.println("==============");
		print(remove);
		System.out.println("==============");
		soft(digits);
		print(digits);
		
	}
	
	private static void print(int[] digit) {
		for(int digits:digit) {
			System.out.print(digits+" ");
		}
	}
	
	
	private static int sum(int[] digits, Predicate<Integer> pridicate) {
		int sum = 0;

		for (int i = 0; i < digits.length; i++) {
			if (pridicate.test(digits[i])) {
				sum += digits[i];
			}
		}

		return sum;
	}

	private static DigitDto getMaxMin(int[] digits) {
		if (digits == null || digits.length == 0) {
			throw new IllegalAccessError();
		}

		DigitDto result = new DigitDto();

		result.setMax(digits[0]);
		result.setMin(digits[0]);

		for (int digit : digits) {
			if (digit > result.getMax()) {
				result.setMax(digit);
			}
			if (digit < result.getMin()) {
				result.setMin(digit);
			}
		}

		return result;
	}

	private static int[] add(int[] digits, int newValue, int index) {
		index= index<0 ? 0:index;
		index= index>=digits.length ? digits.length: index;
		
		int[] result=new int[digits.length+1];
		
		for(int i=0;i<index;i++) {
			result[i] = digits[i];
		}
		result[index]=newValue;
		
		for(int i=index;i<digits.length;i++) {
			result[i+1]=digits[i];
		}
		
		
		return result;
	}

	private static int[] remove(int[] digits, int index) {
		///1, 9, 5, (36), 12, 33
		int[] result =new int[digits.length-1];
		for(int i=0;i<digits.length;i++) {
			if(i==index) {
				for(int j=i;j<digits.length-1;j++)
				digits[j]=digits[j+1];
			}
		}
		return Arrays.copyOfRange(digits, 0, digits.length-1);
//		int[] result =new int[digits.length-1];
//		for(int i=0;i<index;i++) {
//			result[i]=digits[i];
//		}
//		for(int i=index;i<result.length;i++) {
//			result[i]=digits[i+1];
//		}
//		
//		return  result;
	}
	private static void soft(int[] digits) {
		
		for(int i=0;i<digits.length-1;i++) {
			for(int j=i+1;j<digits.length;j++) {
				if(digits[i]>digits[j]) {
					int temp=digits[i];
					digits[i]=digits[j];
					digits[j]=temp;
				}
			}
		}
		
	}
	//1 2 3 4 
	private static void reverse(int[] digit) {
		for(int i=0;i<digit.length/2;i++) {
			int tmp=digit[i];
			digit[i]=digit[digit.length-i-1];
			digit[digit.length-i-1]=tmp;
		}
	}
}
