package immutable;

public class Ex03 {
	/*
	 * • Kiểm tra kí tự bắt đầu, kết thúc trong chuỗi s • Thay thế chuỗi s1 bằng
	 * chuỗi s2 trong chuỗi s • Loại bỏ các khoảng trắng thừa của chuỗi s3 • Tạo
	 * chuỗi con s4 từ chuỗi s bắt đầu từ vị trí số 6
	 */
	public static void main(String[] args) {
		String s = "SGK123";
		String s1 = "SGK";
		String s3 = "      Welcome to our class     ";
		String s4 = "class";
		String s5 = "club";

		System.out.println("check start: " + s.startsWith(s1));
		System.out.println("check end: " + s.endsWith(s1));

		System.out.println("change: " + s3.replace(s4, s5));

		System.out.println("create a string start at index6: " + s3.substring(6, s3.length()));

		// loai bo khoang trang 2 dau
		System.out.println(s3.trim());
		// loai bo khoang trang dau
		System.out.println(s3.stripLeading());
		// loai bo khoang trang cuoi
		System.out.println(s3.stripTrailing());
		// cat full
		//"\\s{1,}" = \\s+ 1 hoac nhieu ky tu spaces
		System.out.println(s3.trim().replaceAll("\\s+", "-"));

	}
}
