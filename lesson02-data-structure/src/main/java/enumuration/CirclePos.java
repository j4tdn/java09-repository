package enumuration;

public enum CirclePos {
	INSIDE("Trong đường tròn"), 
	ONSIDE("Trên đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
	
	public String value;
	
	private CirclePos(String val){ // mặc định là private, không cần thiết phải *private
		value = val;
	}
}
