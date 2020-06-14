package enumuration;

public class EX02CirclePostion {
	public static void main(String[] args) {
		CirclePos pos = getPos(4, 4, 10);
		System.out.println("pos :" + pos);
	}

	private static CirclePos getPos(int xA, int yA, int R) {
		double distance = Math.sqrt(xA * xA + yA * yA);
		if (distance > R)
			return CirclePos.OUTSIDE;
		if (distance == R)
			return CirclePos.ONSIDE;

		return CirclePos.INSIDE;
	}
}
