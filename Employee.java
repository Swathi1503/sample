package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "onetoone.Employee")
@Table(name = "Employees")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empid")
	private int id;

	@Column(name = "empname")
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "LibId")
	private LibraryMembership type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LibraryMembership getType() {
		return type;
	}

	public void setType(LibraryMembership type) {
		this.type = type;
	}

}
