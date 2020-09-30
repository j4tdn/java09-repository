package entities;

public enum BookType {
	TEXT_BOOK ("SGK"),
	REFERENCE_BOOK ("STK");
	
	private String type;
	
	private BookType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
}
