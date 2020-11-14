package immutable;

public class Ex03 {
	public static void main(String[] args) {
		//1. kiểm tra xem kí tự bắt đầu, kết thúc trong chuỗi s có phải là s1 không
		String s ="nguyen hong chanh";
		String s1 = "ng";
		//if (s.indexOf(s1) != 0)
		if(s.startsWith(s1)) {
			System.out.println("bắt đầu bằng s1");
		} else {
			System.out.println("không bắt đầu bằng s1");
		}
	
		if(s.endsWith(s1)) {
			System.out.println("kết thúc bằng s1");
		} else {
			System.out.println("không kết thúc bằng s1");
		}
		
		//2. thay thế chuỗi s1 = s2 trong chuỗi s
		String s2 ="gn";
		String s3 = s.replace(s1, s2);
		System.out.println(s3);
		
		//3. loại bỏ khoảng trắng thừa của chuỗi s3
		String s4 = " Xin   chào   bo!! ";
		//loại bỏ khoảng trắng thừa 2 đầu
		System.out.println(s4.trim());
		
		//loại bỏ khoảng trắng thừa đầu
		
		System.out.println("replace all : " + s4.trim().replaceAll("\\s{1,}", " "));
		
		
		//4. tạo chuỗi s4 từ chuỗi s bắt đầu từ vị trí số 6
	}
}