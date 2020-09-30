package bt5;

public class SachGK extends Sach{
	private boolean state;

	public SachGK(String id, long price, String publisher, boolean state) {
		super(id, price, publisher);
		this.state = state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
	
}
