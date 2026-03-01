package OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "dept_seq")
	@SequenceGenerator(name = "dept_seq", sequenceName = "dept_sequence", initialValue = 100, allocationSize = 1)
	private int deptId;
	private String deptName;
	private String location;
	
	 @OneToMany(mappedBy = "department",
	            cascade = CascadeType.ALL,
	            orphanRemoval = true)
	 private List<Employee> employee = new ArrayList<>();
	 
	 public void addEmployee(Employee emp) {
		 employee.add(emp);
	     emp.setDepartment(this);
	 }

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	 
	 
	
}
