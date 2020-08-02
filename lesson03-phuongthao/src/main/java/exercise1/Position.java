package exercise1;

public class Position {
	double d;
	private float x, y, R;
	private float xR;
	private float yR;

	public Position(float x, float y, float xR, float yR, float R) {
		this.x = x;
		this.y = y;
		this.R = R;
		this.xR = xR;
		this.yR =yR;
	}
	
	public void distance() {

		 d = (float) Math.sqrt((this.x - this.xR)*(this.x - this.xR) + (this.y - this.yR)*(this.y - this.yR));
		 

	}

	public void display() {
		if (d < R)
			System.out.println("distance = " + d + "	Inside");
		else if (d > R)
			System.out.println("distance = " + d + "	Outside");
		else
			System.out.println("distance = " + d + "	On the circle");

	}

	public static void main(String[] args) {
		Position A = new Position(9, 9, 4,5 ,14);
		A.distance(); 
		A.display();

	}

}
