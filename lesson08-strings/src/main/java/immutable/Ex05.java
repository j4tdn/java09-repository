package immutable;

public class Ex05 {
	//Get unique numbers: 1 1 2 3 3 => 1 2
	//Get distinct number: 1 2 3 2 => 1 2 3
	public static void main(String[] args) {
		String s ="1, 2, 2, 3, 3";
		System.out.println(getUniqueNumbers(s));
	}
	
	private static String getUniqueNumbers(String input) {
		String result = "";
		String[] numbers = input.trim().split(", ");
		boolean[] flags = new boolean [numbers.length];
		for (int out = 0; out < numbers.length - 1; out++) {
			if (!flags[out]) {
				for(int in = out + 1; in < numbers.length; in++) {
					if (numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
						}
					}
			}
			if (!flags[out]) {
				result += numbers[out] + ", ";
			}
		}
		
		return result;
	}
}
