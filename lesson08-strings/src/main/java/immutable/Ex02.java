package immutable;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * " 1.Tính chiều dài của chuỗi s 2.Nối chuỗi s1 vào chuỗi s2 3.Lấy một kí tự
		 * tại vị trí index=3 trong chuỗi s 4.Duyệt và in ra từng phần tử trong chuỗi,
		 * các phần tử trùng nhau in ra 1 lần 5.Tìm vị trí xuất hiện đầu tiên, cuối cùng
		 * của chuỗi s2 trong chuỗi s s="how are u,thanks"; s2="a" //kq:start:4, end:13
		 **/
		Conditional condition = (result, input, i) -> !result.contains(String.valueOf(input.charAt(i)));
		String s1 = "JAVA09";
		String s2 = "how are you".replace(" ","");
		System.out.println("câu 1: " + s1.length());
		System.out.println("câu 2: " + s1.concat(s2));
		System.out.println("câu 3: " + s1.charAt(3));
		String result = "";
		for (int i = 0; i < s2.length(); i++) {
			// String perString=s2.subString(0,1);
			String c = String.valueOf(s2.charAt(i));
			if (!result.contains(c)) {
				result = result.concat(c);
			}
		}
		System.out.println("câu 4 cách 1: " + result);
		System.out.println("câu 4 cách 2:" + getUniqueChars(s2, condition));
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
