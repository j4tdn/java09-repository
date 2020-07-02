package exercise01;

public class CirclePosition {
	public static void main(String[] args) {
		float xA = (float) Math.sqrt(1);
		float yA = (float) Math.sqrt(2);
		float xO = 0;
		float yO = 0;
		float r = 2;
		System.out.println(isBelongToCircle(xA, yA, xO, yO, r));
	}

	private static String isBelongToCircle(float xA, float yA, float xO, float yO, float r) {
		float distance = (float) Math.sqrt((xA - xO) * (xA - xO) + (yA - yO) * (yA - yO));
		if (distance > r) {
			return "Không thuộc đường tròn";
		}
		return "thuộc đường tròn";
	}
}
