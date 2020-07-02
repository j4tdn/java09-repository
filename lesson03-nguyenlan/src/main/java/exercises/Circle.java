package exercises;

public class Circle {
	private double centreX;
	private double centreY;
	private double R;
	
	public Circle() {
	}
	public Circle(double centreX, double centreY, double R) {
		this.centreX = centreX;
		this.centreY = centreY;
		this.R = R;
	}
	
	public double getCentreX() {
		return centreX;
	}
	public void setCentreX(float centreX) {
		this.centreX = centreX;
	}
	public double getCentreY() {
		return centreY;
	}
	public void setCentreY(float centreY) {
		this.centreY = centreY;
	}
	public double getR() {
		return R;
	}
	public void setR(float R) {
		this.R = R;
	}
	public boolean isContain(Dot dot) {
		double x = dot.getX();
		double y = dot.getY();
		if(this.R != Math.sqrt(Math.pow(x - centreX, 2) + Math.pow(y - centreY, 2))) {
			return false;
		}
		return true;
	}
	
}
