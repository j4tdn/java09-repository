package datatype;

public class Ex04ObjectTypeExe {
public static void main(String[] args) {
	Integer a=10;
	Integer b=20;
	Integer c=10;
System.out.println("a code:"+System.identityHashCode(a));
System.out.println("a code:"+System.identityHashCode(b));
modified (a);
//swap (a,b);
System.out.println("a:"+a);
System.out.println("b:"+b);
}
private static void modified ( Integer a)
{  System.out.println("a in method code 01: "+System.identityHashCode(a));
	a=20;
   System.out.println("a in method code 02: "+System.identityHashCode(a));
	
}
//a->01 b->02
private static void swap (Integer a,Integer b)
{
	a=a+b; //a->03
	b=a-b; //b->01
	a=a-b; //a->02
}
}
