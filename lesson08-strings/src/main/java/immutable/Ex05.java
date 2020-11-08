package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String input = "1,2,2,3,5";
		System.out.println(getUniqueNumbers(input));
	}

	private static String getUniqueNumbers(String input) {
		StringBuilder result = new StringBuilder();
		String[] temp = input.split(",");
		Boolean[] check = new Boolean[temp.length];

		for (int i = 0; i < temp.length; i++) {
			if (check[i] == false) {
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[i].equals(temp[j])) {
						check[i] = true;
						check[j] = true;
					}
				}
			}
			if (check[i] == false) {
				result.append(temp[i] + "   ");
			}

		}

		return result.toString();
	}
}
