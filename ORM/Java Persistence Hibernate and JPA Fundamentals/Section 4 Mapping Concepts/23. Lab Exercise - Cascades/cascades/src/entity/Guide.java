package entity;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


// for Hibernate 5.x Users
// if you're using Hibernate 5.x, use GenerationType.IDENTITY id generator
// strategy explicitly
// for more information on "GenerationType" have a look at
// https://www.udemy.com/hibernate-and-jpa-fundamentals/learn/v4/questions/937412
/*
 * @Id
 * 
 * @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 */

@Entity
public class Guide {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "staff_id", nullable = false)
	private String staffId;
	private String name;
	private Integer salary;
	@OneToMany(mappedBy = "guide", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Set<Student> students;

	public Guide() {
	}

	public Guide(String staffId, String name, Integer salary) {
		this.staffId = staffId;
		this.name = name;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	public Student returnAStudent() {
		return new ArrayList<>(this.students).get(0);
	}

}