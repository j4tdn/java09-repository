package homework_01;



public class Circle {
	private double cx;
	private double cy;
	private double r;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public double getCx() {
		return cx;
	}

	public void setCx(double cx) {
		this.cx = cx;
	}

	public double getCy() {
		return cy;
	}

	public void setCy(double cy) {
		this.cy = cy;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public Circle(double cx, double cy, double r) {
		
		this.cx = cx;
		this.cy = cy;
		this.r = r;
	}
	
	public boolean check(Point p) {
		double x = p.getX();
		double y = p.getY();
		if(this.r > Math.sqrt(Math.pow(x - cx, 2) + Math.pow(y - cy, 2))) {
			
			return true;
			
		}
		
		return false;
		
	}
	
		
}




