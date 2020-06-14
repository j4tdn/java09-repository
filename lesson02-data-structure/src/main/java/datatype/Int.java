package datatype;

/**
 * Holding the integer value
 * @author THAIBINH
 *
 */
public class Int {
	
	// properties
	public int value;
	
	// constructer
	public Int(int val) {
		value = val;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
