package immutable;

public class Ex03 {
	public static void main(String[] args) {
		String s="SGK123";
		String s1="SGK";
		
		String s2=s.substring(s.length()-s1.length(),s.length());
		//System.out.println(s2);
		if(s.startsWith(s1)) {
			System.out.println("Bắt đầu");
		}
		else if(s.endsWith(s1)) {
			System.out.println("Kết thức");
		}else System.out.println("không");
		String s3="   cheers from Da Nang";
		//System.out.println("trailing:"+s3.stripTrailling);
		System.out.println("replaceAll:"+s3.trim().replaceAll("\\+s", "-"));
	}
}
