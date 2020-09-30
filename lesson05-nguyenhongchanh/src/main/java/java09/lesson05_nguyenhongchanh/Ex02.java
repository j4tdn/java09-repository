package java09.lesson05_nguyenhongchanh;

public class Ex02 {
	
public static int getMissingNumber(int[] a,int b) {
	int miss=0;
	int ex[] = new int[b];
	for (int i=0; i<b ; i++) {
		ex[i] = i+1;
	}
	
	for (int i = 0; i< b-1; i++) {
		for (int j=0; j< b-1; j++) {
			if (a[i] < a[j]) {
				int tmp =a[i];
				a[i]= a[j];
				a[j]=tmp;
			}
		}
	}
	for (int i = 0; i< b-1; i++) {
		if (ex[i] != a[i]) {
			miss = ex[i];
			break;
		}else miss = ex[b-1];
	}
	return miss;
}

public static void main(String[] args) {
	int a[]= {3, 7, 9, 2, 1, 6, 5, 4, 10};
	int b= 10;
	System.out.println(getMissingNumber(a,b));
	
}
}
