package immutable;

public class Ex05 {
	// get unique number : 1 2 2 3 => 1 3
		public static void main(String[] args) {
			String s = "1, 2, 2, 3";
			System.out.println(getUniqueNbers(s));
		}

		private static String getUniqueNbers(String input) {
			StringBuilder result = new StringBuilder("");
			String[] numbers = input.split(", ");
			boolean[] flags = new boolean[numbers.length];

			for (int i = 0; i < numbers.length; i++) {
				if (!flags[i]) {
					for (int j = i + 1; j < flags.length; j++) {
						if (numbers[i].equals(numbers[j])) {
							flags[i] = true;
							flags[j] = true;
						}
					}
				}
				if (!flags[i]) {
					result.append(numbers[i] + "  ");
				}

			}
			return result.toString();
		}
}
