package exam;

public class Textbook extends Book {

	private boolean state;

	public Textbook(String idBook, float unitPrice, String publisher, boolean state) {
		super(idBook, unitPrice, publisher);
		this.state = state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public boolean getState() {
		return this.state;
	}

	@Override
	public String toString() {
		String temp;
		if (this.state == true) {
			temp = "new";
		} else {
			temp = "old";
		}
		return super.toString() + "----" + temp;
	}

	public float tinhTienSGK() {
		float temp = 0;
		if (this.state == true) {
			temp = 1;
		} else {
			temp = 0.3f;
		}
		return this.getUnitPrice() * temp;
	}

}
