
public class Bai01 {
	
	

	public static void main(String[] args) {
		
		int [] a= {5,8,9};
		
		for(int i=0;i<=a.length;i++) {
			
			for (int j=i+1;j<=a.length-1;j++) {
				
				if(a[i]>a[j]) {
					
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
					
				}
			}
			
		}
		for(int i=0;i<a.length;i++) {
			
			System.out.print("Thu tu tang dan: "+a[i]);
			
		}
		

	}

}
