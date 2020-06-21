package enumuration;

public enum CirclePos {
	INSIDE("Trong duong tron"),
	ONSIDE("Tren duong tron"), 
	OUTSIDE("Ngoai đường tron");
	
	String message;
	private CirclePos(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.message;
	}
}
