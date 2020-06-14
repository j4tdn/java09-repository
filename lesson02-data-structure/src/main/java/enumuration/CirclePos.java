package enumuration;

public enum CirclePos {
	INSIDE("Trong duong tron"),
	ONSIDE("Tren duong tron"),
	OUTSIDE("Ngoai duong tron");
	
	public String value;
	
	CirclePos(String val) {
		value=val;
	}
}
