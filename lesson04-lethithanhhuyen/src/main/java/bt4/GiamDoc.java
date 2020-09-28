package bt4;

public class GiamDoc extends People {
	private float hsLuong;
	private float hsChucVu;
	
	public GiamDoc() {
		
	}
	public GiamDoc(String name,int year, float hsLuong, float hsChucVu) {
		this.name = name;
		this.year = year;
		this.hsLuong = hsLuong;
		this.hsChucVu = hsChucVu;
	}

	public float getHsLuong() {
		return hsLuong;
	}

	public void setHsLuong(float hsLuong) {
		this.hsLuong = hsLuong;
	}

	public float getHsChucVu() {
		return hsChucVu;
	}

	public void setHsChucVu(float hsChucVu) {
		this.hsChucVu = hsChucVu;
	}
	
	public long luong() {
		return (long)(this.hsLuong + this.hsChucVu)*1250000;
	}
	
	@Override
	public String toString() {
		return "Giám đốc: "+this.name+"\t"+this.year+"\tHS lương: "+this.hsLuong+"\tHS chức vụ: "+this.hsChucVu;
	}

}
