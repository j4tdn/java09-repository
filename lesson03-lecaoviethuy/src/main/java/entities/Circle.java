package entities;

public class Circle {
	private double centerX;
	private double centerY;
	private double radius;
	
	public Circle() {
	}

	public Circle(double centerX, double centerY, double radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
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

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public boolean isContain(double x, double y) {
		return (Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2)) > radius) ? false : true;
	}
}
