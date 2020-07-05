package view;

import java.util.Scanner;

import bean.Vihicle;

public class VihicleDemo {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Vihicle[] vihicle=new Vihicle[4];
		int work=0;
		System.out.println("1. nhap thong tin");
		System.out.println("2. xuat thong tin");
		System.out.println("3. Thoat");
		do {
			
			System.out.println("moi chon cong viec");
			work=sc.nextInt();
			sc.nextLine();
		switch (work) {
		case 1:		
			for(int i=0;i<3;i++) {
				System.out.println("nhap du lieu lan "+(i+1));
			System.out.println("nhap ten");
			String a=sc.nextLine();
			System.out.println("nhap hang~");
			String b=sc.nextLine();
			System.out.println("nhap dung tich");
			int c=sc.nextInt();
			System.out.println("nhap gia");
			int d=sc.nextInt();
			
			sc.nextLine();
			vihicle[i]=new Vihicle(a, b, c, d);	
			
			} 
			for(int j = 0; j < 3; j++) {
				System.out.println(vihicle[j]);
			}
			continue;
		case 2:
			for(int i = 0; i < 3; i++) {
				System.out.println(vihicle[i]);
			}
			break;
		case 3:
			System.out.println("thoat");
			break;
		default:
			break;
			}
		}while(work !=3);
	
	}
}
