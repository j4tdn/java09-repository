package enumuration;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a= 10;
		int b=5;
		//operate : + - * /
		int result = Operate(a , b , Operator.MUL);
		System.out.println(" value : " + result);
	}
	private static int Operate(int a , int b,Operator o) {
		int result =0;
		switch(o) {
		case PLUS:
			result = a+b;
			break;
		case MINUS:
			result = a-b;
			break;
		case MUL:
			result = a*b;
			break;
		case DIV:
			result = a/b;
			break;
			
		}
		return result;
}
}