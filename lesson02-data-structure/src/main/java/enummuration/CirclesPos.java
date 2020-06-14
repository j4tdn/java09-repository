package enummuration;

public enum CirclesPos {
	INSIDE("trong đường tròn"),
	ONSIDE("trên đường tròn"),
	OUTSIDE("ngoài đường tròn");
	
	public String value;
	CirclesPos(String val){
		value = val;
	}
}
