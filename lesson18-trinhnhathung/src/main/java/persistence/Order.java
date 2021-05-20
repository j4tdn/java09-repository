package persistence;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "donhang")
public class Order {
	
	@Id
	@Column(name = "MaDH")
	private Integer id;
	
	@Column(name = "NgayTao")
	private LocalDate createDate;
	
	public Order() {

	}

	public Order(Integer id, LocalDate createDate) {
		super();
		this.id = id;
		this.createDate = createDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
}
