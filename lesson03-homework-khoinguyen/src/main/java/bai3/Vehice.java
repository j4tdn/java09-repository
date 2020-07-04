package bai3;

public class Vehice {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private long gia;
	private long thue;

	public Vehice() {
	}

	public Vehice(String ptenChuXe, String ploaiXe, int pdungTich, long pgia) {
		this.tenChuXe = ptenChuXe;
		this.loaiXe = ploaiXe;
		this.dungTich = pdungTich;
		this.gia = pgia;
	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getloaiXe() {
		return loaiXe;
	}

	public void setloaiXe(String loaiXe) {
		loaiXe = loaiXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public String toString() {
		return tenChuXe + loaiXe + dungTich + gia;
	}

	public long getThue() {
		if(this.dungTich<100) {
			thue= this.gia*=0.01;
		}else{
			if(this.dungTich<200 && this.dungTich>=100) {
				thue=this.gia*=0.03;
			}else thue=this.gia*=0.05;
				
			
			}
		return thue;
	}

	public void setThue(long thue) {
		this.thue = thue;
	}


}
