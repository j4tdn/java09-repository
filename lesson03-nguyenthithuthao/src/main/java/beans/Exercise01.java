package beans;

import java.util.Scanner;

public class Exercise01 {
public static void main(String[] args) {
	int xM,yM,xO,yO,R;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter xO: ");
	xO= scan.nextInt();
	System.out.print("Enter yO: ");
	yO = scan.nextInt();
	System.out.print("Enter xM: ");
	xM = scan.nextInt();
	System.out.print("Enter yM: ");
	yM = scan.nextInt();
	System.out.print("Enter R: ");
	R = scan.nextInt();
	int distance = (xM-xO)*(xM-xO) + (yM - yO)*(yM-yO);
	if(distance<(R*R)) {
		System.out.println("Điểm nằm trong đường tròn!");
		
	}else if(distance>(R*R)) {
		System.out.println("Điểm nằm ngoài đường tròn!");
		
	}else 
		System.out.println("Điểm nằm trên đường tròn!");
	
}
}
