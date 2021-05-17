package persistence;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DonHang")
public class Order {
	
	@Id
	@Column(name = "MaDH")
	private Integer id;
	
	@Column(name = "PhiVanChuyen")
	private Double feeShip;
	
	@Column(name = "TongTien")
	private Double total;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaKH", referencedColumnName = "MaKH")
	private Customer customer;

	public Order() {
	}
	
	public Order(Integer id, Double feeShip, Double total, Customer customer) {
		super();
		this.id = id;
		this.feeShip = feeShip;
		this.total = total;
		this.customer = customer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getFeeShip() {
		return feeShip;
	}

	public void setFeeShip(Double feeShip) {
		this.feeShip = feeShip;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", feeShip=" + feeShip + ", total=" + total + ", customer=" + customer + "]";
	}
	
}
