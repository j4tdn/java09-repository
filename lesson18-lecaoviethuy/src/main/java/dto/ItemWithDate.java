package dto;

import java.time.LocalTime;

public class ItemWithDate {
	private Integer id;
	private String name;
	private LocalTime saleTime;
	
	public ItemWithDate() {
		// TODO Auto-generated constructor stub
	}

	public ItemWithDate(Integer id, String name, LocalTime saleTime) {
		this.id = id;
		this.name = name;
		this.saleTime = saleTime;
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

	public LocalTime getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(LocalTime saleTime) {
		this.saleTime = saleTime;
	}

	@Override
	public String toString() {
		return "ItemWithDate [id=" + id + ", name=" + name + ", saleTime=" + saleTime + "]";
	}
	
}
