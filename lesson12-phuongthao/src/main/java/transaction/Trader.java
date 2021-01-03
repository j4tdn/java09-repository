package transaction;

public class Trader {
	private String name;
	private String city;
	
	
	public Trader() {
	}


	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}


	public String getcity() {
		return city;
	}


	public void setcity(String city) {
		this.city = city;
	}


	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}


	@Override
	public String toString() {
		return  name + "," + city ;
	}
	
	

}
