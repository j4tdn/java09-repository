package exercises;

public class Circle {
	private double centerX;
	private double centerY;
	private double R;

	public Circle() {
	}

	public Circle(double centerX, double centerY, double r) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
		R = r;
	}

	public double getCenterX() {
		return centerX;
	}

	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}

	public double getCenterY() {
		return centerY;
	}

	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

	public boolean isContain(double xA, double yA) {

		return Math.sqrt(Math.pow(xA - centerX, 2) + Math.pow(yA - centerY, 2)) <= R ? true : false;
	}
}
