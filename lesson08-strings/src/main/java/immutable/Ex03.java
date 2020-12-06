package immutable;

public class Ex03 {
	/**
	 1. Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s 
	    có phải là s1 không.  startsWith, endsWith
	    VD: s  = "SGK123"
	        s1 = "SGK"; 
	 2. Thay thế chuỗi s1 bằng chuỗi s2 trong  chuỗi s
	    s = "welcome to our class" replace
	    s1 = "class"
	    s2 = "club"
	 3. Loại bỏ các khoảng trắng thừa của chuỗi s3
	    s3 = "   cheers  from Da Nang  "
	    => "cheers from Da Nang"
	 4. Tạo chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 6
	    VD: s3 = "cheers from Da Nang" , subString
	    => " from Da Nang"
	 */
	public static void main(String[] args) {
		String s3 = "   cheers  from    Da    Nang  ";
		// Loại bỏ khoảng trắng thừa 2 đầu
		System.out.println(s3.trim());
		
		// Loại bỏ đầu
		System.out.println("leading: " + s3.stripLeading());
		
		// Loại bỏ cuối
		System.out.println("trailing: " + s3.stripTrailing());
		
		// \\s{1,} = \\s+ pattern 1 || n spaces
		System.out.println("replaceAll: " + s3.trim().replaceAll("\\s+", "-"));
	}
}
