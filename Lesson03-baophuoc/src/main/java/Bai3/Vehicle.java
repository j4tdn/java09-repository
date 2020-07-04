package Bai3;

public class Vehicle {
	private  String tenchuxe;
	private  String loaixe;
	private  int dungtich;
	private  long gia;
	private  long thue;

	public String toString() {
		return tenchuxe + "  " + loaixe + "  " + dungtich + "  " + gia;
	}
	
	public String getTenchuxe() {
		return tenchuxe;
	}

	public void setTenchuxe(String tenchuxe) {
		this.tenchuxe = tenchuxe;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public long getThue() {
		if(this.dungtich<100) {
			thue= this.gia*=0.01;
		}else{
			if(this.dungtich<200 && this.dungtich>=100) {
				thue=this.gia*=0.03;
			}else thue=this.gia*=0.05;
				
			
			}
		return thue;
	}

	public void setThue(long thue) {
		this.thue = thue;
	}

	public Vehicle() {

	}

	public Vehicle(String tenchuxe, String loaixe, int dungtich, long gia) {
		this.tenchuxe = tenchuxe;
		this.loaixe = loaixe;
		this.dungtich = dungtich;
		this.gia = gia;
	}
	
	}


