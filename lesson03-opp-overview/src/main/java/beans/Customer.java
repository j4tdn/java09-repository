package beans;

public class Customer {
	private String name;
	private String phonenumber;
	private String id;
	private String adress;

	// default constructor
	public Customer() {

	}

	public Customer(String name, String phonenumber, String id, String adress) {
		this.name = name;
		this.phonenumber = phonenumber;
		this.id = id;
		this.adress = adress;
	}

//getter ,setter 
	public void setName(String name) {
		this.name = name;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getId() {
		return id;
	}

	public String getAdress() {
		return adress;
	}

}
