package datatype;

public class Ex01PrimitiveType {
	private static int f=10; //biến toàn cục. thuộc tính của biến global variable

	public static void main(String[] args) {
		//local variable
		// int || integer : int bắt buộc nhập, integer: không bắt buộc nhập
		//ưu tiên biến cục bộ hownn 
		int a = 10;
		float b=5.2f;
		double c=3.3d;
		char d='d';
		boolean e=true;
		
		System.out.println("Print: "+ a + ","+b);
	}

}
