package enumuration;

public class Ex02CriclesPosition {
public static void main(String[] args) {
	CirclesPos Pos =getPos(4, 4, 10);
	System.out.println( Pos.value);
	}
	private static CirclesPos getPos(int xA, int yB ,int r) {
		double distance=Math.sqrt(xA*xA+yB*yB);
		if (distance > r) {
			return CirclesPos.INSIDE;
		}
		if(distance ==r) {
			return CirclesPos.ONSIDE;
		
	}
		return CirclesPos.OUTSIDE;
}
}

