package persitence;

public class ItemGroupDto {
	
	//propertise
	public static final String  ID="id";
	public static final String  NAME="name";
	public static final String  ITEM_DETAILS="list";
	public static final String  TOTAL_OF_ITEM="Number";
	
	
	private Integer id;
	private String name;
	private String list;
	private Integer Number;
	
	public ItemGroupDto(Integer id, String name, String list, Integer number) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.Number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public Integer getNumber() {
		return Number;
	}

	public void setNumber(Integer number) {
		Number = number;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", list=" + list + ", Number=" + Number + "]";
	}
	
	
}
