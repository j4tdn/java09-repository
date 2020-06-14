package enummuration;

public enum CirclePos {
	INSIDE("trong duong tron"),
	ONSIDE("tren duong tron"),
	OUTSIDE("ngoai đường tron");
	public String value;
	CirclePos(String val) {
		value=val;
	}
}
