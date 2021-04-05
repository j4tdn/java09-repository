package persistence;

public class ItemGroupDto {
	private Integer Id;
	private String Name;
	private String MH;
	private Double TSL;
	
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemGroupDto(Integer id, String name, String mH, Double tSL) {
		super();
		Id = id;
		Name = name;
		MH = mH;
		TSL = tSL;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMH() {
		return MH;
	}

	public void setMH(String mH) {
		MH = mH;
	}

	public Double getTSL() {
		return TSL;
	}

	public void setTSL(Double tSL) {
		TSL = tSL;
	}
	
	
}
