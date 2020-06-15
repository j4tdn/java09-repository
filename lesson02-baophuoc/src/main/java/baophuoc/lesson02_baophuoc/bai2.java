package baophuoc.lesson02_baophuoc;

public class bai2 {
	public static void main(String[] args) {
		
		long s=tinhGiaithua(4)+tinhGiaithua(7)+tinhGiaithua(12)+tinhGiaithua(18);
		
		System.out.println(s);
		
}
	public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }

	

}

