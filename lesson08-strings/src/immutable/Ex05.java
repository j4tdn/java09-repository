package immutable;

public class Ex05 {
	// get unique numbers 1 2 3 2 => 1 3 in ra cacs so xuat hien 1 lan
	// get distinct number 1 2 3 2 => 1 2 3 loai bo phan tu trung nhau
	public static void main(String[] args) {
		String input = "1, 2, 2, 3";

		System.out.println(getUniqueNbers(input));
	}

	private static StringBuilder getUniqueNbers(String input) {

		StringBuilder result = new StringBuilder();

		String[] numbers = input.trim().split(", ");

		// default: false
		boolean[] flags = new boolean[numbers.length];

		for (int out = 0; out < numbers.length; out++) {
			if (flags[out] == false) {
				for (int in = out + 1; in < numbers.length; in++) {
					if (numbers[out].equals(numbers[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}

			}

			if (flags[out] == false) {
				result.append(numbers[out] + " ");
			}
		}
		return result;

	}
}
