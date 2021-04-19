package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "sinhvien")
@NamedQueries({
	@NamedQuery(name = "Student.GET_ALL",
			    query = "SELECT st FROM Student st") // HQL
})
public class Student {
	
	public static final String GET_ALL = "Student.GET_ALL";

	@Id
	@Column(name = "masv")
	private Integer id;
	
	@Column(name = "ten")
	private String firstName;
	
	 @Column(name = "ho")
	 private String lastName;
	
	@Column(name = "email")
	private String email;

	// JPA default constructor
	public Student() {
	}

	public Student(Integer id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
