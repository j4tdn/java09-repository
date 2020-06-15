import java.util.Scanner;

public class Bai03 {
	
	public static boolean isSoDoiXung(int n) {
		int temp,sum = 0,r;
		
		for(temp=n;n!=0;n=n/10){
	         r=n%10;
	         sum=sum*10+r;
	    }
	    if(temp==sum) {
	    	System.out.println("Số đối xứng");
	    	return true;
	    } 
	    else
	    	
	    	System.out.println("K phai số đối xứng");
	        return false;
		
	}
	

	public static void main(String[] args) {
		int n;
		
		
		System.out.print("Nhap so: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		System.out.println(isSoDoiXung(n));
		
		

	}

}
