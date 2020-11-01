package immutable;

public class XuLiChuoi {
	/*
	 * 1.Tinh chieu dai cua chuoi s 2.Noi chuoi s1 vao chuoi s 3.Lay 1 ki tu tai vi
	 * tri index=4 va in ra xem no bang may 4.Duyet va in ra tung phan tu trong cai
	 * chuoi, cac phan tu trung nhau chi in ra 1 lan 5.Tim vi tri xuat hien dau tien
	 * va cuoi cung cua chuoi s2 trong chuoi s vd: chuoi s = "How are you,thanks";
	 * s2 = "a"; kqua:start : 4 , end : 13
	 */
	public static void main(String[] args) {
		Conditional condition = (result,input,i) -> !result.contains(String.valueOf(input.charAt(i)));
		String s = "How are you, im ok thank  ok you and you";
		String s1 = "! im ok";
		String s2 = "ok";
		System.out.println("Cau 1 :" + s.length());	
		System.out.println("Cau 2 : " + s.concat(s1));
		System.out.println("Cau 3 :" + s.charAt(4));
		System.out.print("Cau 4 :" + s.charAt(0) + " ");
		for(int i = 1 ; i < s.length() ; i++) {
			int check = 0;
				for (int j = i-1 ; j >=0 ; j--) {
					if (s.charAt(j)==s.charAt(i)) {
						check = 1;
					}			
			}
			if (check == 0) {
				System.out.print(s.charAt(i) + " ");
			}
			check = 0;
		}
		System.out.println("\nCau 5 vi tri dau tien :" + s.indexOf(s2));
		System.out.println("Cau 5 vi tri cuoi cung:" + s.lastIndexOf(s2));
		System.out.println("Cau 4 cach 2 : " + getUniqueChars(s, condition));
	}
	private static String getUniqueChars(String input,Conditional condition) {
		String result = "";
		for (int i = 0 ; i < input.length() ; i ++) {
			if (condition.test(result, input, i)) {
				result = result + input.charAt(i);
			}
		}
		return result;
	}
}
