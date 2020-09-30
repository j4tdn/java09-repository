package java09.lesson05_nguyenhongchanh;

public class Ex01 {
	
	public static int[] getUniqueNumber(int[] b) {
		int kq[] = new int[19];
		int a=0;
		for (int i=0; i < b.length ; i++) {
			int tmp =0;
			for (int j = 0; j < b.length ; j++) {
				if (b[i] == b[j]) { 
					tmp++;}
				}
			if (tmp != 2) {
				kq[a] = b[i];
				a++;}
			}
		for (int i= 0; i< kq.length ; i++) {
			for (int j=0; j< kq.length; j++) {
				if (kq[i] < kq[j]) {
					int tmp=kq[i];
					kq[i]=kq[j];
					kq[j]=tmp;
					}
			}
		}
		for (int i= 0; i< kq.length ; i++) {
			System.out.print(kq[i] + " ");
		}
		return kq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 15, 21, 0, 15, 17, 21};
		getUniqueNumber(a);
	}

}
