package exercise01;

public class Ex04 {
	public static void main(String[] args) {
		int[] num = {5, 1, 9, 11, 20, 19, 17, 21, 30};
		
		sapxep(num);
		
		solelonthuhai(num);
		
	}
	
	private static void sapxep(int[] num) {
		for (int i=0; i< num.length -1; i++) {
			for (int j=i+1; j< num.length; j++) {
			if(num[i] < num[j]) {
				int tmp =num[i];
				num[i]=num[j];
				num[j]=tmp;
				}
			}
		}
	}
	
	private static void solelonthuhai(int[] num) {
		int r=0;
			for (int i=0; i< num.length; i++) {
				if(num[i] % 2 != 0) {
					r++;
					if (r==2) {
						System.out.println(num[i]);
						break;
					}
				}
			}
		}

}
