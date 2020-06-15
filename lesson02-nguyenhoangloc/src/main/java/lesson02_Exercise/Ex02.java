package lesson02_Exercise;

public class Ex02 {
	public static void main(String[] args) {
		long sum=0;
		long gt=1;
		for(int i=2;i<=18;i++) {
			gt *=i;
			if(i==4 || i==7 || i==12 || i==18) {
				sum +=gt;
			}
		}
		System.out.println("4! + 7! + 12! + 18! ="+sum);
	}
}
