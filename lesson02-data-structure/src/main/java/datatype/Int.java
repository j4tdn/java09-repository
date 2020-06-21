package datatype;

/**
 * Holding the integer value
 *
 */

public class Int {
	//properties
	public int value;

	public Int(int value) {
		this.value = value;
	}
	
	public Int() {
	}
	
	@Override
	public String toString() {
		return value + "";
	}
}
