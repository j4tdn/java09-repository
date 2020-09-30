package Test05;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Book book[]=new Book[1];
		for(int i=0;i<1;i++) {
			System.out.println("chọn loại sách: 1- sách giáo khoa,2-sách tham khảo");
			int choose;
			Scanner sc=new Scanner(System.in);
			choose=sc.nextInt();
			if(choose==1) {
				book[i]=new TextBook();
				book[i].input();
			}else {
				book[i]=new ReferenceBook();
				book[i].input();
			}
		}
		for (Book book2 : book) {
			System.out.println(book2.toString());
		}
	}
}
