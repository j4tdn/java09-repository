package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "   welcome  to our class";
		System.out.println("câu 2:" + s.replace("class", "club"));
		String s1 = "SGK123";
		String s2 = "SGK";
		if (s.indexOf(s1) == 0) {
			System.out.println("chuỗi bắt đầu bằng chuỗi kết thúc");
		}
		String s3 = "  Cheers from    Da Nẵng  ";
		System.out.println("câu 4:" + s3.substring(6));
//		loại bỏ đầu
		System.out.println(s3.stripLeading());;
//		loại bỏ khoảng trắng thừa 2 đầu
		System.out.println(s3.trim());
//		loại bỏ cuối
		System.out.println(s3.stripTrailing());
//		cắt full
		System.out.println("replaceAll:"+s3.trim().replaceAll("\\s{1,5}","-"));
		

	}
}
