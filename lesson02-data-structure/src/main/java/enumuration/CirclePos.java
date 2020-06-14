package enumuration;

public enum CirclePos {
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	
	CirclePos(String val){
		value=val;
	}
}
