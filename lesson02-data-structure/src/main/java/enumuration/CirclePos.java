package enumuration;

public enum CirclePos {
inside("trong") ,outside("ngoài") ,onside("trên");
	
	public String value;

	private CirclePos (String val){
		value =val;
	}
}
