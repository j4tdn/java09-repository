package enumuration;

public enum CirclePos {
	INSIDE("Trong duong tron"), OUTSIDE("Ngoai duong tron"), ONSIDE("Ngoai duong tron");

	public String value;

	CirclePos(String val) {
		value = val;
	}
}
