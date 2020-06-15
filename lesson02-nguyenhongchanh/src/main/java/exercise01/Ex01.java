package exercise01;

public class Ex01 {
	public static void main(String[] args) {
		int[] num = {9,5,7};
		for (int i=0; i< num.length -1; i++) {
			for (int j=i+1; j< num.length; j++) {
			if(num[i] > num[j]) {
				int tmp =num[i];
				num[i]=num[j];
				num[j]=tmp;
				}
			}
		}
		
		for (int i=0; i< num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
