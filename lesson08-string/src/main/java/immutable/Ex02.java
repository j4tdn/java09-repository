package immutable;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * 1.Tính chiều dài của chuỗi s
		 * 2.Nối chuỗi s1 vào s2
		 * 3. Lấy một ký tự tại vị trí index=3 trong chuỗi s
		 * 4. duyệt và in ra từng phần tử trong chuỗi. các phần tử in ra 1 lần
		 * 5. Tìm ví trí xuất hiện đầu tiên, cuối cùng của chuỗi s2 trong s
		 */
		/*Conditional condition=new Conditional() {
			
			@Override
			public boolean test(String result, String input, int i) {
				return !result.contains(String.valueOf(input.charAt(i)));
			}
		};*/
		Conditional condition = ( result,  input,  i) ->!result.contains(String.valueOf(input.charAt(i)))
		;
		String s="how are u,thanks";
		String s2="a";
		System.out.println("Length s:"+ s.length());
		System.out.println("s1+s2:"+s+" "+s2);
		System.out.println("index=3:"+s.charAt(4));
		
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");
		}
		System.out.println("");
		String s1=""+s.charAt(0);
		int count;
		for(int i=1;i<s.length();i++) {
			count=0;
			for(int j=0;j<s1.length();j++) {
				if(s.charAt(i)==s1.charAt(j)) {
					count ++;
				}
			}
			if(count==0) {
				s1+=" "+s.charAt(i);
			}
		}
		System.out.println(s1);
		System.out.println(getUniqueChars(s,condition));
	}
	private static String getUniqueChars(String input,Conditional condition) {
		String result="";
		for(int i=0;i<input.length();i++) {
			if(condition.test(result, input, i)) {
				result=result+input.charAt(i);
			}
		}
		return input;
		
	}
	private static String getUniqueCharsC2(String input) {
		String result="";
		for(int i=0;i<input.length();i++) {
			String preString=input.substring(0,i);
			
			String c=String.valueOf(input.charAt(i));
			if(preString.indexOf(c)==-1) {
				result.concat(c);
			}
		}
		return input;
		
	}
}
