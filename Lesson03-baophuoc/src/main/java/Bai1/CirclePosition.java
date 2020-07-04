package Bai1;

public enum CirclePosition {
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	
	 CirclePosition(String val){
		value=val;
	}
}
