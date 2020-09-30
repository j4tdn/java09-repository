package Test02;

public class Test02 {

	public static void main(String[] args) {
		int[] list= {1,2,3,4,6,5};
		int result=getMissingNumber(list, 7);
		System.out.println(result);
	}
	public static int getMissingNumber(int[] a,int n) {
		int count,result=0;
		for(int i=1;i<=n;i++) {
			count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					count++;
				}
			}
			if(count==0) {
				result=i;
				break;
			}
		}
		return result;
	}
}
