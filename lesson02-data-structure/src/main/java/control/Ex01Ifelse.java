package control;

import java.util.Scanner;

public class Ex01Ifelse {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("nhap diem ");
		float n = sc.nextFloat();
		
		while (true) {
			if (n <= 10 && n >= 0) {
				break;
			} 
			System.out.println("diem khong hop le, nhap lai");
			n = sc.nextFloat();
			
		}
		
		if (n <5) {
			System.out.println("yeu");
		}
		else if ( n <= 6.5) {
			System.out.println("trung binh");
		}
		else if ( n <= 8) {
			System.out.println("kha");
		}
		else {
			System.out.println("gioi");
		}

	}

}
