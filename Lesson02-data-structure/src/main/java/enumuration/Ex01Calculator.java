package enumuration;

public class Ex01Calculator {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = oprator(a, b, Oprator.DIV);
		System.out.println("div:" + result);
	}

//operate: + - * /
	private static int oprator(int a, int b, Oprator o) {
		int result = 0;
		switch (o) {

		case PLUS:
			result = a + b;
			break;
		case MINUS:
			result = a - b;
			break;
		case MUL:
			result = a * b;
			break;
		case DIV:
			result = a / b;
			break;
		}
		return result;
	}
}
