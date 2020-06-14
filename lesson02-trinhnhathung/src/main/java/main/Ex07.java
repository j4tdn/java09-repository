package main;

import java.util.Random;

public class Ex07 {
		public static void main(String[] args) {
			int[]a = {20,21,22,23,24,25,26,27,28,29,30};
			int []b =new int[5];
			int i=-1;
			Random rd=new Random();
			int count=0;
			while (count<5) {
				do {
					i=rd.nextInt(11);
				} while (a[i]==0);
				b[count]=a[i];
				a[i]=0;
				count++;
			}
			for (int x:b) {
				System.out.println(x);
			}
		}
}
