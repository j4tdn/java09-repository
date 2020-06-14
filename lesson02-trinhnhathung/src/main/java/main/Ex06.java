package main;

public class Ex06 {
		public static void main(String[] args) {
			int count=1;
			int a=1;
			while (count<=200) {
				 a++;
				 if (isPrime(a)==true) count++;
			}
			System.out.println(a);
		}
		public static boolean isPrime (int a) {
			for (int i=2;i<=Math.sqrt(a);i++) {
				if (a%i ==0) return false;
			}
			return true;
		}
}
