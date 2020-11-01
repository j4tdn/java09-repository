package immutable;import javax.management.StringValueExp;

public class Ex03 {
	public static void main(String[] args) {
		String s="SGK123";
		String s1="dGK";
		if(s.indexOf(s1)==0) {
			System.out.println("co bat dau");
		}else System.out.println("khong bat dau");
	///cau 2 replace
	///cau 3
		String s3="    da              nang   ";
		//loai bo 2 dau
		System.out.println(s3.trim());
		//loai bo dau
		System.out.println(s3.stripLeading());
		//loai bo cuoi
		System.out.println(s3.stripTrailing());
		
		//cat full. \\s{1,}==\\s+
		System.out.println("replaceALL:"+s3.trim().replaceAll("\\s{1,}","-" ));
	
	
	}
	private static void ex02(String s1, String s2) {
		
	}
}
