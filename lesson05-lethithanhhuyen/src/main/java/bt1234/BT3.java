package bt1234;

public class BT3 {
	public static void main(String[] args) {
		int a = 10;
		int b = 100;
		boolean kt = isPowerOf(a, b);
		System.out.println("("+a+','+b+") "+kt);
	}
	
	public static boolean isPowerOf (int a, int b) {
		if (a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if (a == 1 && b ==1) {
			return true;
		}
		if (a==0 && b == 0) {
			return false;
		}
		if (b==0 || b==1) {
			return false;
		}
		
		boolean kt = true;
		while (a>1 && kt) {
			if (a%b == 0) {
				a = a/b;
			}else {
				kt = false; 
				break;
			}
		}
		
		if (kt) {
			return true;
		}else {
			return false;
		}
	}

}
