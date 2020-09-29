package ex03;


public class Ex03 {
	
	public static void Pascal(int n) {
		int[][] p = new int[n+1][n+1];
		System.out.println("======Tam giác Pascal chiều cao " + n + " =======");
		
		for(int i = 0;i <= n; i++)
	    {
	        for(int j = 0; j <= i; j++)
	        {
	            if(i == j || j == 0)
	            {
	                p[i][j] = 1;
	                System.out.print(p[i][j] + "	");
	            }
	            else {
	                p[i][j] = p[i-1][j-1] + p[i-1][j];
	                System.out.print(p[i][j] + "	");	           
	            }
	        }
	        System.out.println();
	    }
	}
	public static void main(String[] args) {
		Pascal(5);
	}

}
