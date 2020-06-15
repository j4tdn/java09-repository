package exercise;

public class Exercise1 {
	public static void main(String[] args) {
		int a =10;
		int b =14;
		int c =5;
		int temp;
		if (a>b) {
			temp = a;
			a=b;
	        b=temp;
		}
		if (a>c) {
			temp = a;
			a=c;
	        c=temp;
		}
		if(b>c){
	        temp=b;
	        b=c;
	        c=temp;
	    }
		System.out.println ("Thu tu tang dan " +a +" " + b+" "  +c);
	}
}
