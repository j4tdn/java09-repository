package java09.lesson05_nguyenhongchanh;

public class Ex03 {
public static boolean isPowerOf(int a, int b) {
	boolean  result =false;
	int lt = a;
	int cs = b;
	if (a<b) {
		lt=b;
		cs = a;}
	
	int tmp =1;
	while (tmp < lt){
		tmp =tmp * cs;
		if (lt - tmp == 0) {
			result = true;
			break;
		}
	}
	return result;
}
	
public static void main(String[] args) {
	
	if(isPowerOf(3,8)) {System.out.println("1");}
	else {System.out.println("0");}
	
}

}
