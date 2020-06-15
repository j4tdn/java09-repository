package enummuration;

public class Ex02CirclePostion {

	public static void main(String[] args) {
		CirclesPos pos = getPos(4, 4, 10);
				System.out.println("Pos: " + pos.value);

	}
	private static CirclesPos getPos(int xA, int yA, int R) {
	double distance = Math.sqrt(xA*xA + yA*yA);
	if(distance > R) {
		return CirclesPos.OUTSIDE;
	}
	if(distance == R) {
		return CirclesPos.ONSIDE;
	}
	
		return CirclesPos.INSIDE;
	}
}