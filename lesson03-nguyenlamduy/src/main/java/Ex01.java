import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
	int x,y,r,x1,y1;
		
	
		System.out.print("Nhập X(O): ");
		x=sc.nextInt();
		System.out.print("Nhập Y(O): ");
		y=sc.nextInt();
		System.out.print("Nhập bán kính(R): ");
		r=sc.nextInt();
		System.out.print("Nhập X(A): ");
		x1=sc.nextInt();
		System.out.print("Nhập Y(A): ");
		y1=sc.nextInt();
		
		CirclePos pos= getPos(x1,y1,x,y,r);
		
		System.out.println(pos.value);
		
		
}
	
	private static CirclePos getPos(int xA,int yA,int xo,int yo,int R) {
		
		double distance= Math.sqrt((xA-xo)*(xA-xo)+(yA-yo)*(yA-yo));
		if(distance<R)
			return CirclePos.INSIDE;
		if(distance==R)
			return CirclePos.ONSIDE;
		return CirclePos.OUTSIDE;
		
		
		
	}
}
