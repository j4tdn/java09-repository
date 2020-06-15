package nguyenthithuthao.lesson02_nguyenthithuthao;
import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = scan.nextInt();
		int a=0;
		int b =n;
		int c;
		while(b>0) {
			c=b%10;
			a=a*10 +c;
			b=b/10;
			
		}
		if(a==n) 
			System.out.println("Symmetric Number!");
		else 
			System.out.println("NonSymmetric Number!");
		
	}
	 
	
		
	}

	
	

