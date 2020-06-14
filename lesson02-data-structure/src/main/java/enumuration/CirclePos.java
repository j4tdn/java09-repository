package enumuration;

public enum CirclePos {
	INSIDE("Trong đường tròn"), 
	ONSIDE("Trên đường tròn"), 
	OUTSIDE("Ngoài đường tròn");

	public String string;

	private CirclePos(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}
