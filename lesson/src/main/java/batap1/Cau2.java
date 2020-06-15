package batap1;
public class Cau2 {
	
	public long giaithua(int n) {
		long gt = 1;
		if (n == 0 || n == 1) {
			return gt;
		} else {
			for (int i=2; i<=n; i++) {
				gt *=i;
			}
			return gt;
		}
	}	

	public static void main(String[] args) {
		Cau2 b2 = new Cau2();
		long ans = b2.giaithua(4) + b2.giaithua(7) + b2.giaithua(12) + b2.giaithua(18);
		System.out.println("S= 4! + 7! + 12! + 18! = "+ ans);
	}

}
