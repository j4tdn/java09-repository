package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KhachHang")//nãy t làm lon t copy qua..chắc lỗi haha để xem sửa đc k
public class Customer {
	@Id
	@Column(name = "MaKH")
	private Integer id;
	
	@Column(name = "TenKH")
	private String name;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "DiaChi")
	private String address;
	
	@Column(name = "SoDienThoai")
	private String phoneNumber;
	
	@Column(name = "MangXaHoi")
	private String socialNetwork;
	
	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY )
	private List<Order> orders;
	
	public Customer() {
	}
	
	public Customer(Integer id, String name, String email, String address, String phoneNumber, String socialNetwork) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.socialNetwork = socialNetwork;
	}
	
	public Customer(Integer id, String name, String email, String address, String phoneNumber, String socialNetwork,
			List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.socialNetwork = socialNetwork;
		this.orders = orders;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSocialNetwork() {
		return socialNetwork;
	}

	public void setSocialNetwork(String socialNetwork) {
		this.socialNetwork = socialNetwork;
	}
	
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public List<Order> getOrders() {
		return orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", socialNetwork=" + socialNetwork + "]";
	}
	
}
