package nguyenthithuthao.lesson02_nguyenthithuthao;
import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		long bin, i, sum = 0;
		i=1;
		System.out.println("Enter your number:");
		number = scan.nextInt();
		do {
			bin=number%2;
			sum=sum + (i*bin);
			number=number/2;
			i=i*10;
			
		}while(number>0);
		
	
			System.out.println("Binary code: " + sum);
	
		
	}

}

