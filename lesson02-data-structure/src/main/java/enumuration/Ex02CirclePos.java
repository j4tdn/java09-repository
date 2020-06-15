package enumuration;

public class Ex02CirclePos {
	public static void main(String[] args) {
		
		CirclePos pos = getPos(4,4,2);
		System.out.println("pos: " +pos.value);
		
	}
	
	private static CirclePos getPos( int xa, int ya, int r) {
		double d = Math.sqrt(xa*xa + ya+ya);
		 if (d > r) {
			 return CirclePos.outside;
		 }
		 if (d == r) {
			 return CirclePos.onside;
		 }
			 return CirclePos.inside;
	}
}
