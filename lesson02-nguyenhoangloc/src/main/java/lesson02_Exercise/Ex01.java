package lesson02_Exercise;

public class Ex01 {

	public static void main(String[] args) {
		int a =20;
		int b =13;
		int c =27;
		int d;
		if(a>b) {
			d=a;
			a=b;
			b=d;
		}
		
		if (a>c) {
			d = a;
			a=c;
			c=d;
		}
		if(b>c){
			d=b;
			b=c;
			c=d;
		}
		System.out.println ("Thu tu tang dan " +a +" " + b+" "  +c);
	}

}
