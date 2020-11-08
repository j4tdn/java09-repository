package immutable;

public class Ex05 {
	public static void main(String[] args) {
		String s = "1, 2, 2, 3";
	}
	
	private static String getUniqueNumbers(String s) {
		String result = "";
		String ar[] =s.trim().split(",");
		boolean[] flags = new boolean[ar.length];
		for(int out = 0; out < ar.length; out++) {
			if(!flags[out]) {
				for(int in = out + 1; in < ar.length; in++) {
					if(ar[out].contentEquals(ar[in])) {
						flags[out] = true;
						flags[in] = true;
					}
				}
			}
		}
		for(int i = 0; i < ar.length; i++) {
			if(flags[i] == false) {
				result +=ar[i] + " ";
			}
		}
		return result;
	}
}
