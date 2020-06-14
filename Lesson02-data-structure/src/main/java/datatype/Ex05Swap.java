package datatype;

public class Ex05Swap {
public static void main(String[] args) {
	Int a= new	Int(5);
	Int b= new Int(10);
	System.out.println("a value:"+ a);
	System.out.println("b value:"+b);
	swap(a,b);
	System.out.println("===");
	System.out.println("a value:"+ a);
	System.out.println("b value:"+b);
	System.out.println("a"+a);
}
private static void modified (Int a)
{   //a.value=22;
	a= new Int (99);//tro toi mot o nho khac trong heap.
	a.value=77;
	
}
private static void swap ( Int a ,Int b)
{
  int tmp =a.value;
      a.value=b.value;
      b.value=tmp;
}
}
