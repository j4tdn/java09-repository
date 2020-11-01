package immutable;

public class Ex02 {
	public static void main(String[] args) {
		String s = "how are you,thanks";
		
		//1. tính chiều dài chuỗi s, xem chuỗi có bao nhiêu kí tự
		System.out.println("length s: "+ s.length());
		
		
		//2. nối cuỗi s1 vào chuỗi s
		String s1 = " Lan";
		String s3 = s + s1;
		System.out.println("s + s1: " + s3);
		
		//3. lấy một kí tự tại vị trí index = 3, in ra 
		System.out.println("kí tự tại vị trí index = 3: " + s.charAt(3));
		
		//4. duyệt và in ra từng phần tử trong chuỗi, các phần tử trùng nhau chỉ in ra một lần, ví dụ: "abcbd" => "abcd"
		ex4(s);
		Conditional condition = ( result,  input,  i) -> result.indexOf(input.charAt(i)) == -1;
		ex04(s, condition);
		
		//5. tìm vị trí xuấ hiện ddaauf tiên, cuối cùng của chuỗi s2 trong chuỗi s, 
		//s = "how are u, thanks"
		// s1 = "are" =>>kết quả: start : 4, end: 13;
		
		s1 = "a";
		System.out.println("start: " + s.indexOf(s1));
		System.out.println("end: " + s.lastIndexOf(s1));
		
		
	}
	private static void ex4(String s) {
		System.out.println("4: ");
		boolean check = true;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i - 1; j >= 0; j--) {
				if(s.charAt(j) == s.charAt(i)) {
					check = false;
					break;
				}
			}
			if(check == true) {
				System.out.print(s.charAt(i));				
			}
			check = true;
		}
		System.out.println();
	}
	
	private static void ex04(String s, Conditional condition) {
		String result = "";
		for(int i = 0; i < s.length(); i++) {
			if(condition.test(result, s, i)) {
				result = result + s.charAt(i);
			}				
		}
		System.out.println(result);
	}
}
