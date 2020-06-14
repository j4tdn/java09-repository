package main;

public class Ex03 {

	public static void main(String[] args) {
		
		int value1 = 12321;
		int value2 = value1;
		int tmp = 0;
		while(value1 != 0) {
			tmp = tmp * 10 + value1 % 10;
			value1 /= 10;
		}
		
		if(value2 == tmp)
			System.out.println("Số đối xứng !");
		else System.out.println("Không phải !");
				
	}

}
