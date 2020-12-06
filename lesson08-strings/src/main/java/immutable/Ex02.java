package immutable;

public class Ex02 {
	/**
	 * 1. Tính chiều dài của chuỗi s
       2. Nối chuỗi s1 vào chuỗi s
       3. Lấy một ký tự tại vị trí index = 3 trong chuỗi s
       4. Duyệt và in ra từng phần tử trong chuỗi
          "abcbd" => "abcd"
          Các phần từ trùng nhau chỉ in ra 1 lần
       5. Tìm vị trí xuất hiện đầu tiên, 
          cuối cùng của chuỗi s2 trong chuỗi s
	      s = "how are u, thanks";
	      s2 = "a"
	      // KQ: start: 4,  end: 13
	 */
	public static void main(String[] args) {
		String s = "how are you".replace(" ", "");
		System.out.println("C1: " + getUniqueChars(s,  (result, input, i) -> !result.contains(String.valueOf(input.charAt(i)))));
		System.out.println("C2: " + getUniqueChars(s,  (result, input, i) -> input.substring(0, i).indexOf(input.charAt(i)) == -1));
	}
	
	private static String getUniqueChars(String input, Conditional condition) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (condition.test(result, input, i)) {
				result = result + input.charAt(i);
			}
		}
		return result;
	}
}
