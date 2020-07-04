package exercises;

import java.util.Scanner;

public class Ex01CirclePosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tam O cua duong tron :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.print("Nhap ban kinh duong tron :");
		int R = sc.nextInt();
		System.out.print("Nhap toa do diem A :");
		int xA = sc.nextInt();
		int yA = sc.nextInt();
		
		String pos = getPos(x,y,xA,yA,R);
		System.out.println("pos: " + pos);
	}
	
	private static String getPos(int x,int y,int xA,int yA, int R) {
		double distance = Math.sqrt((x-xA)*(x-xA) + (y-yA)*(y-yA));
		//System.out.println(distance);
		if(distance < R) {
			return CirclePos.INSIDE.value;
		}
		if(distance > R) {
			return CirclePos.OUTSIDE.value;
		}
		return CirclePos.ONSIDE.value;
	}
}

