package immutable;

/**
   1.tinh chieu dai chuoi s
   2.Noi chuoi s1 vao chuoi s 
   3. Lay 1 kys tu tai vi
   tri index =3 trong chuoi s 
   4. Duyet va in ra tung phan tu trong chuoi Cac
      phan tu trung nhau chi in ra 1 lan 
   5. Tim vi tri xuat gien dau tien va cuoi
      cungcua chuoi s2 trong chuoi s s="how are you",thanks"; s2="a";
 */
public class Ex02 {
	public static void main(String[] args) {
		String s = "How are you".replace(" ", "");
		String s1 = "Hello! ";
		System.out.println("length: " + s.length());
		System.out.println("Sum: " + s1 + s);
		System.out.println("index 3 = :" + s.charAt(3));
		System.out.println(getUniqueChars(s,(String result, String input, int i) -> !result.contains(String.valueOf(input.charAt(i)))));
		System.out.println(getUniqueChars(s,(String result, String input, int i) -> input.substring(0, i).indexOf(input.charAt(i)) == -1));

		
		// 

	}
// CAU 4 CACH 1
	
	private static String getUniqueChars(String input,Conditional condition) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			String c = String.valueOf(input.charAt(i));
			if (condition.test(result, input, i))
				result = result.concat(c);
		}
		return result;
	}
//CAU 4 CACH 2:
	
	
}
