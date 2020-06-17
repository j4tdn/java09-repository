package lesson02exercises;

//Bài 06: Tìm số nguyên tố thứ 200

public class bai06 {
	public static void main(String[] args) {
		int dem=0;
		int i;
		for (i=2; i<9999; i++) {
			if (SoNguyenTo(i)) {
				dem=dem+1;
			}
			if (dem==200)
				break;
		}
		System.out.println("Số nguyên tố thứ 200 là" + i);}
			
		
		private static boolean SoNguyenTo(int n) {
			 if(n<=2){
				   return false;
				  }
			 else {
				   for(int i=2; i<= (int)Math.sqrt(n);i++){
				    if(n % i == 0)
				     return false;
				   }
				  }
				  return true;
				 }
	   	     
					

	}
