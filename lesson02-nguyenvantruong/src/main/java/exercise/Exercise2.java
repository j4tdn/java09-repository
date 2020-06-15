package exercise;

public class Exercise2 {
	
	
public static long tinhGiaiThua(int n) {
	long gt =1;
     if (n == 0 || n == 1) {
         return gt;
     } else {
         for (int i = 2; i <= n; i++) {
        	   gt*= i;
         }
         return gt;
     }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int a=4;
			 int b=7;	
			 int c=12;
			 int d=18;
			
			 System.out.println(tinhGiaiThua(a)+tinhGiaiThua(b)+tinhGiaiThua(c)+tinhGiaiThua(d));
			
	}	
	
	

}
