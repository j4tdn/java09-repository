package datatype;

/**
 * 
 * Holding the integer value
 *
 */
public class Int {
	//properties :dac diem cua class int
	public int value;
	
	//constructor
	public Int(int val) {
		value = val;
	}
	
	@Override
	public String toString() {
		return ""+ value; //de kieu tra ve la string
	}
}
