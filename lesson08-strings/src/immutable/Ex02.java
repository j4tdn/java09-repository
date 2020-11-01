package immutable;

public class Ex02 {
	public static void main(String[] args) {

		/*
		 * • Tính chiều dài của chuỗi s • Nối chuỗi s1 vào chuỗi s • Lấy một ký tự tại
		 * vị trí index =3 trong chuỗi s • Duyệt từng phần tử trong chuỗi. Cac phan tu
		 * trung nhau chi in 1 lan • Tìm vị trí xuất hiện đầu tiên, cuối cùng của chuỗi
		 * s2 trong chuỗi s
		 */

		String s = "hello. ";
		String s1 = "how are you".replace(" ", "");

		System.out.println(s.length());
		System.out.println(s + s1);

		System.out.println(s.charAt(3));
		// System.out.println("c: " + getUniqueChars(s1));
		// System.out.println("c: " + getUniqueCharsC2(s1));

		Conditional condition = (result, input, i) -> !result.contains(String.valueOf(input.charAt(i)));
		System.out.println("C1" + getUniqueCharsC3(s1, condition));
		System.out.println("C2" +getUniqueCharsC3(s1, (result, input, i) ->input.substring(0, i).indexOf(input.charAt(i))==-1));
		

	}

	/*
	 * private static String getUniqueChars(String input) { String result = ""; for
	 * (int i = 0; i < input.length(); i++) { String c =
	 * String.valueOf(input.charAt(i)); if (!result.contains(c)) { result += c; //
	 * result = result.concat(c); } } return result; }
	 * 
	 * private static String getUniqueCharsC2(String input) { String result = "";
	 * for (int i = 0; i < input.length(); i++) { String preString =
	 * input.substring(0, i);
	 * 
	 * if (preString.indexOf(input.charAt(i))==-1) { result = result
	 * +input.charAt(i); // result = result.concat(c); } } return result;
	 * 
	 * }
	 */

	private static String getUniqueCharsC3(String input, Conditional condition) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (condition.test(result, input, i)) {
				result = result + input.charAt(i); // result = result.concat(c);
			}
		}
		return result;

	}

}
