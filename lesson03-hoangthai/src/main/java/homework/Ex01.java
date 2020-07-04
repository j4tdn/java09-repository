package homework;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		double r,ox,oy,ax,ay,d;
		Scanner sn = new Scanner(System.in);
		System.out.println(" Nhập bán kính: ");
		r = Double.parseDouble(sn.nextLine());
		
		System.out.println("Nhập tọa độ x, y của tâm đường tròn: ");
		ox = Double.parseDouble(sn.nextLine());
		oy = Double.parseDouble(sn.nextLine());
		
		System.out.println("Nhập tọa độ x, y của điểm cần tiềm: ");
		ax = Double.parseDouble(sn.nextLine());
		ay = Double.parseDouble(sn.nextLine());
		
		d = Math.sqrt((ax - ox)*(ax - ox) + (ay - oy)*(ay - oy));
		
		if(d<=r) 
			System.out.println("Điểm vừa nhập thuốc đường tròn");
		else
			System.out.println("Điểm vừa nhạp không thuộc đường tròn");
	}

}
