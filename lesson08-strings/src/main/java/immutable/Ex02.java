package immutable;

public class Ex02 {
	/**
	 1	•Tính chiều dài của chuỗi s
	 2	• Nối chuỗi s1 vào chuỗi s
	 3  • Lấy một ký tự tại vị trí index trong chuỗi s    index = 3
	 4  • Duyệt từng phần tử trong chuỗi		"abcbd" => abcd
	 5  • Tìm vị trí xuất hiện đầu tiên, cuối cùng củachuỗi s2 trong chuỗi s
	 		s="how are u , thanks";
	 		s2="a"
	 	kq:Strart:4 , end 13
	 */
	public static void main(String[] args) {
		String s = "How are you".replace("", "");
		String s1 = "hello";
		String s2 = s+s1;
		System.out.println("length : " + s.length());
		System.out.println(s2);
		System.out.println("danan".charAt(3));
		// CAU 4 C1:
		Conditional condition = (result,  input,  i) -> !result.contains(String.valueOf(input.charAt(i)));
		System.out.println("C1 : " + getUniqueChars(s,(result,  input,  i) -> !result.contains(String.valueOf(input.charAt(i)))));
		
		// CAU 4 C2:
		System.out.println("C2 : " + getUniqueChars(s,(result,  input,  i) -> input.substring(0,i).indexOf(input.charAt(i))== -1));
		
		
}
	
	
	
	// CAU 4 C1:
	private static String getUniqueChars(String input,Conditional conditon) {
		String result = "";
		for (int i=0;i<input.length();i++) {
			String c = "" + input.charAt(i);
			if(conditon.test(result, input, i)) {
				result += c;
			}
		}
		return result;
}
}
	
	// CAU 4 C2:
	