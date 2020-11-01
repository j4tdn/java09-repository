package immutable;

public class Ex02 {
	public static void main(String[] args) {
		String s = "hello world".replace(" ", "");//xoa khoang trang
		String s1 = " vn ";
		// 1
		System.out.println("length:" + s.length());
		// 2
		System.out.println("noi chuoi:" + s + s1);
		// 3
		System.out.println("3:" + s.charAt(3));
		// 4
		Conditional conditional=new Conditional() {
			
			@Override
			public boolean test(String temp, char i) {
				for (char item : temp.toCharArray()) {
					if (i == item) {
						return true;
					}
				}
				return false;
			}
		};
		System.out.println("result:"+getUniqueChars(s, conditional));
		
		//5
		String s2="how are you, are you";
		String s3="re";
		
		
		
	}
	private static String getUniqueChars(String s,Conditional conditional) {
		char[] c = s.toCharArray();
		String result="";
		char[] temp = new char[c.length];
		int k = 0;
		for (char i : c) {
			if (!conditional.test(String.copyValueOf(temp), i)) {
				result+=i;
			}
			temp[k++] = i;
		}
		return result;
		
	}

}
