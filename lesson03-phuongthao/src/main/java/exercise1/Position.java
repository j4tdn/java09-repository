package exercise1;

public class Position {
	double d;
	private float x;
	private float y;
	private float R;
	private float xR;
	private float yR;

	public static void main(String[] args) {
		Position A = new Position(9, 9, 4, 5, 14);
		A.distance();
		A.display();

	}

	public Position(float x, float y, float xR, float yR, float R) {
		this.x = x;
		this.y = y;
		this.R = R;
		this.xR = xR;
		this.yR = yR;
	}

	public void distance() {

		d = (float) Math.sqrt((this.x - this.xR) * (this.x - this.xR) + (this.y - this.yR) * (this.y - this.yR));

	}

	public void display() {
		if (d < R)
			System.out.println("distance = " + d + "\nInside");
		else if (d > R)
			System.out.println("distance = " + d + "\nOutside");
		else
			System.out.println("distance = " + d + "\nOn the circle");

	}

}
