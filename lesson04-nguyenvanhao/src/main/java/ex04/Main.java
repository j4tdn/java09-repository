package ex04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int amount,choose;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập số lượng nhân viên:");
		amount=sc.nextInt();
		System.out.println("Nhập thông tin nhân viên!!!");
		People[] pp=new People[amount];
		for(int i=0;i<amount;i++) {
			System.out.print("Chọn loại nhân viên(1-staff,2-mangaer,3-director");
			 choose=sc.nextInt();
			 if(choose==1) {
				 pp[i]=new Staff();
			 }
			 else if(choose==2) {
				 pp[i]=new Manager();
			 }
			 else pp[i]= new Director();
			 pp[i].input();
		}
		for (People people : pp) {
			System.out.println(people.toString());
			System.out.println("-----------------------");
		}
	}
}
