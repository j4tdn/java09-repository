package persistence;

public class Item {
	
	public static String TEN_ID = "tenId";
	public static String TEN_MH = "tenMH";
	public static String SO_LUONG = "soLuong";
	
	private Integer tenId;
	private String tenMH;
	private Double soLuong;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer tenId, String tenMH, Double soLuong) {
		super();
		this.tenId = tenId;
		this.tenMH = tenMH;
		this.soLuong = soLuong;
	}

	public Integer getTenId() {
		return tenId;
	}

	public void setTenId(Integer tenId) {
		this.tenId = tenId;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public Double getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(Double soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "Item [tenId=" + tenId + ", tenMH=" + tenMH + ", soLuong=" + soLuong + "]";
	}
	
}
