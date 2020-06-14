package datatype;

/**
 * Holding integer value
 */
public class Int {
	// properties
	public int value;

	//constructor
	public Int() {
	}

	public Int(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
