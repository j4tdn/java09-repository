//package enumuration;
//
//public class Ex02CirclePosition {
//	public static void main(String[] args) {
//		CirclePos pos = getPos(4, 4, 10);
//		System.out.println("pos : " + pos.value);
//	}
//
//	public static CirclePos getPos(int xA, int yA, int R) {
//		double distance = Math.sqrt(xA * xA + yA * yA);
//		if (distance > R) {
//			return CirclePos.OUTSIDE;
//		}
//		if (distance == R) {
//			return CirclePos.ONSIDE;
//		}
//		return CirclePos.INSIDE;
//
//	}
//}

package enumuration;

public class Ex02CirclePosition {
	public static void main(String[] args) {
		String pos = getPos(4, 4, 10);
		System.out.println("pos : " + pos);
	}

	public static String getPos(int xA, int yA, int R) {
		double distance = Math.sqrt(xA * xA + yA * yA);
		if (distance > R) {
			return CirclePos.OUTSIDE.value;
		}
		if (distance == R) {
			return CirclePos.ONSIDE.value;
		}
		return CirclePos.INSIDE.value;

	}
}

