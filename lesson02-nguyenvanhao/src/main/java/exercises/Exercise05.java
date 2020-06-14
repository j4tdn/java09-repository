package exercises;

public class Exercise05 {
    public static boolean isPrime(double n) {
    	if(n==0||n==1) return false;
    	for(int i=2;i<Math.sqrt(n);i++) {
    		if(n%i==0) return false;
    	}
    	return true;
    }
	public static void main(String[] args) {
		int i=0;
		int dem=0;
		while(dem!=200) {
			i++;
			if(isPrime(i)==true) dem++;
		}
		System.out.println(i);
	}

}
