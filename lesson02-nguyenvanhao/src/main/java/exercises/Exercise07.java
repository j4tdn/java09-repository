package exercises;

import java.util.Random;

public class Exercise07 {

	public static void main(String[] args) {
		int[] ar=new int[5];
		boolean co;
		int count;
		Random rd=new Random();
		for(int i=0;i<5;i++) {
			co=true;
			while(co) {
				count=0;
				ar[i]=(int)(Math.random() * (30 - 20) + 20);
				if(i==0) co=false;
				for(int j=0;j<i;j++) {
					if(ar[j]==ar[i]) count++;
				}
				if(count==0) co=false;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(ar[i]+"  ");
		}
	}

}
