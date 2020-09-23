package beans;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int x,y,a,b;
		float r;
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap toa do tam duong tron");
		System.out.println("Nhap x: ");
		a = ip.nextInt();
		System.out.println("Nhap y: ");
		b = ip.nextInt();
		System.out.println("Nhap ban kinh: ");
		r = ip.nextFloat();
		System.out.println("Nhap toa do diem bat ki: ");
		System.out.println("Nhap toa do x: ");
		x = ip.nextInt();
		System.out.println("Nhap toa do y: ");
		y = ip.nextInt();
		
		if(checkPointCircle(x, y, a, b, r)) {
			System.out.println("Diem thuoc duong tron");
		} else {
			System.out.println("Diem khong thuoc duong tron");
		}
		
	}
	public static boolean checkPointCircle(int x, int y, int a, int b, float r) {
		if(r == Math.sqrt((x - a)*(x - a) + (y - b)*(y - b))) {
			return true;
		} 
		return false;
	}
}
