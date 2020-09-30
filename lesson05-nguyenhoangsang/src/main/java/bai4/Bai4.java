package bai4;

public class Bai4 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,5};
		System.out.println("Boi chung nho nhat cua mang la :" + getLeastCommonMultiple(arr));
	}
	public static int getLeastCommonMultiple(int arr[]) {
		int temp = BCNN(arr[0],arr[1]);
		//System.out.println(temp);
		for(int i = 2; i < arr.length; i ++) {
			System.out.println(temp);
			temp = BCNN(temp,arr[i]);
		}
		return temp;
	}
	public static int UCLN(int a, int b){
	    if(a==b) return a;
	    if(a>b) 
	        return UCLN(a-b,b);
	    else
	        return UCLN(a,b-a);
	    //return a;
	}
	public static int BCNN(int a, int b){
	    return (a*b/UCLN(a,b) );
	}
}
