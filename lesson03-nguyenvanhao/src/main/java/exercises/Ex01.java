package exercises;
import java.util.Scanner;
public class Ex01 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
		System.out.print("Nhap hoanh do tam duong tron:");
		float xO = sc.nextFloat();
		System.out.print("Nhap tung do tam duong tron:");
		float yO = sc.nextFloat();
		System.out.print("Nhap ban kinh duong tron:");
		float r = sc.nextFloat();
		System.out.print("Nhap xA:");
		float xA = sc.nextFloat();
		System.out.print("Nhap yA:");
		float yA = sc.nextFloat();		
		OnCircle(xO, yO, r, xA,yA);
		}
	}
	private static void OnCircle(float xO, float yO, float r, float xA, float yA) {
		// TODO Auto-generated method stub
		float OA = ((xA - xO) * (xA - xO) + (yA - yO) * (yA - yO));
		float radius=r*r;
		if(OA<radius) {
			System.out.println("Diem A nam trong duong tron");
		}
		else if(OA==radius) {
			System.out.println("Diem nam tren duong tron");
		}
		else System.out.println("Diem A nam ngoai duong tron");
	}
}
	
