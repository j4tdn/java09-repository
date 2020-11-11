package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String input = "1, 2, 2, 3";
		System.out.println(getUniqueNbers(input));
	}

private static String getUniqueNbers(String input) {
	String result = "";
	String[] numbers = input.trim().split(",");
	boolean[] flags = new boolean[numbers.length];
	for(int out = 0; out < numbers.length; out++) {
		if(!flags[out]) {
			for(int in = out + 1; in < numbers.length; in++) {
					if (numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
					}
		}
		if(!flags[out]) {
			result += numbers[out]+",";
	}
	
	}
	
}
	return result;
}

}
