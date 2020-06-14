package main;

public class Ex05 {

	public static void main(String[] args) {
		int dec = 10;
		int tmp = 0;
		int bin = 0;
		int count = 0;
		
		while(dec != 0) {
			tmp = tmp * 10 + dec % 2;
			dec = dec / 2;
			count++;
		}

		while(tmp != 0) {
			bin = bin * 10 + tmp % 10;
			tmp = tmp / 10; 
			count--;
		}
		
		for(int i = 0; i < count; i++) {
			bin = bin * 10;
		}
		
		System.out.println(bin);
	}

}
