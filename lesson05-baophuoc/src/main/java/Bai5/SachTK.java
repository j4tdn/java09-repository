package Bai5;

public class SachTK extends Sach{
	private double Thue;
	
	public SachTK() {
		super();
	}
	
	public SachTK(double Thue) {
		super();
		this.Thue=Thue;
	}

	public double getThue() {
		return Thue;
	}

	public void setThue(double thue) {
		Thue = thue;
	}
	
	public void NhapThongTin() {
		super.NhapThongTin();
		System.out.print("Nhap Thue (%): ");
		Thue = scanner.nextDouble();
	}
	
	 public String toString() {
	        return super.toString() + ", thuế: " + this.Thue;
	    }
}
