package enumuration;

public class Ex01Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		
		//operate
		int result = operate(a, b, Operator.plus);
		System.out.println(result);
	}
	
	private static int operate (int a, int b, Operator o) {
		int result=0;
		switch (o) {
		case plus:
			result = a+b;
			break;
		case minus:
			result = a-b;
			break;
		case mul:
			result = a*b;
			break;
		case div:
			result = a/b;
			break;
		}
		return result;
	}

}
