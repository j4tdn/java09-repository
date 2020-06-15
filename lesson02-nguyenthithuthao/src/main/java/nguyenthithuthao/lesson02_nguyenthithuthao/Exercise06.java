package nguyenthithuthao.lesson02_nguyenthithuthao;

import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args) {
		int i;
		int num=0;
		
		for(num =1;num<1000;++num) {
			int dem =0;
			for(i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					dem=dem+1;
				}
					
			}
			if(dem==200) {
				System.out.println(num);
			}
			
		}
	}
}
		
		
		
		
		

		

