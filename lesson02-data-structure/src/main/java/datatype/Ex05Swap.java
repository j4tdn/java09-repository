package datatype;

public class Ex05Swap {
	public static void main(String[] args) {
		Int a = new Int(5); // 5 luu trong heap
		Int b = new Int(10);
		System.out.println("a value :" + a);
		System.out.println("b value :" + b);
		swap(a, b);
		System.out.println("a value :" + a);//10
		System.out.println("b value :" + b);//5
		
		modified(a);
		
	}
	
	private static void modified(Int a) {
		a = new Int(99);//a tro toi 1 o nho khac o heap , o nho nay chua gia tri 99
		a.value = 77;
	}
	
	private static void swap(Int a,Int b) {
		int temp = a.value;
		a.value = b.value;
		b.value = temp;
	}
}

