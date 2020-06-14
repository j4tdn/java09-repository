package enumuration;

public class Ex02CirclePosition {
	public static void main(String[] args) {
		CirclePos pos = getPos(4, 4, 9);
		System.out.println("pos: " + pos.value);
	}

	private static CirclePos getPos(int xA, int yA, int R) {
		double distance = Math.sqrt(xA * xA + yA * yA);
		if(distance > R) {
			return  CirclePos.OUTSIDE;
		}
		if(distance == R) {
			return CirclePos.ONSIDE;
		}
		return CirclePos.INSIDE;
	}
}
