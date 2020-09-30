package Bai5;

public class SachTK	extends Sach {
	private int thue;

	public SachTK() {
		// TODO Auto-generated constructor stub
	}

	public SachTK(int thue) {
		super();
		this.thue = thue;
	}

	public int getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}

	public void nhapSach() {
		super.nhapSach();
		System.out.print("Nhập thuế: ");
		thue = ip.nextDouble();
	}

	@Override
	public String toString() {
		return super.toString() + ", thuế: " + this.thue;
	}
}
