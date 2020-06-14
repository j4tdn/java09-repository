package enumuration;

public class Ex02CirclePosition {
	public static void main(String[] args) {
		// A(xA,yA), O(0,0), R
		System.out.println(getPos(4, 4, 10));
	}

	public static String getPos(int xA, int yA, int R) {
		double distance = Math.sqrt((xA * xA) + (yA * yA));
		if (distance > R) {
			return CirclePos.OUTSIDE.getString();
		}
		if (distance == R) {
			return CirclePos.ONSIDE.getString();
		}
		return CirclePos.INSIDE.getString();

	}
}
