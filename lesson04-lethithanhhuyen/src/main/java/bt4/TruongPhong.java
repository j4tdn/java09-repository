package bt4;

public class TruongPhong extends People{
	private float hsLuong;
	private int slnv;
	
	public TruongPhong() {
		
	}
	public TruongPhong(String name,int year, float hsLuong, int slnv) {
		this.name = name;
		this.year = year;
		this.hsLuong = hsLuong;
		this.slnv = slnv;
	}
	public float getHsLuong() {
		return hsLuong;
	}
	public void setHsLuong(float hsLuong) {
		this.hsLuong = hsLuong;
	}
	public int getSlnv() {
		return slnv;
	}
	public void setSlnv(int slnv) {
		this.slnv = slnv;
	}
	
	public long luong() {
		return (long) (this.hsLuong * 2200000);
	}
	
	@Override
	public String toString() {
		return "Trưởng Phòng: "+this.name+"\t"+this.year+"\tHS lương: "+this.hsLuong+"\tSố lượng nhân viên: "+this.slnv; 
	}
}
