package immutable;

public class Ex03 {
	public static void main(String[] args) {
		// 1.
		String s = "SGK123";
		String s1 = "SGK";
		if (s1.equals(s.substring(0, s1.length()))) {
			System.out.println("true bat dau");
		} else {
			System.out.println("no bat dau");
		}

		if (s1.equals(s.substring(s.length() - s1.length(), s.length()))) {
			System.out.println("true ket thuc");
		} else {
			System.out.println("no ket thuc");
		}
		// 2.

		String t = "welcome to our class";
		String t1 = "class";
		String t2 = "club";

		String[] spl = t.split(" ");
		String result = "";
		for (String i : spl) {
			if (i.equals(t1)) {
				i = t2;
			}
			result += i + " ";
		}
		System.out.println("2:" + result);

		// 3
		String s3 = "     cheers  from  Da                                                                   Nang       ";
//		System.out.println(s3.stripLeading());
//		System.out.println(s3.stripTrailing());
		System.out.println(s3.trim());
		System.out.println("replaceAll:"+s3.replaceAll("\\s+", " "));//=\\+

	}

}
