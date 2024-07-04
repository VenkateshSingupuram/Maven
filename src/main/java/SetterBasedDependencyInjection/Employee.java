package SetterBasedDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Spring Frame Work Can Understanding Only these Annotations	

@Component
public class Employee {
	
	// Instance Variable
	
	private String employeeName;
	private String employeeId;
	private String department;

// Employee Depends On Address

	Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired // Adreess Will be Injected Automatically.
	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	@Value("Ram")
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;

	}

	@Value("101")
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	@Value("Software")
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", department=" + department
				+ ", address=" + address + "]";
	}

}
