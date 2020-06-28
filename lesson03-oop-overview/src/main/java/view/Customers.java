package view;

public class Customers {
	private String 	name;
	private String numbers;
	private String cmnd;
	private String address;
	
	public Customers() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customers(String name, String numbers, String cmnd, String address) {
		
		this.name = name;
		this.numbers = numbers;
		this.cmnd = cmnd;
		this.address = address;
	}
		
	}
	

