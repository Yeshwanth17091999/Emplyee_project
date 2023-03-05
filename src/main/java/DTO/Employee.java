package DTO;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	
	private String emp_fName;
	private String emp_lName;
	
	private Date emp_dob;
	@Id
	private String password;
	
	private String emp_address;
	
	private String emp_email;
	
	private String emp_qual;
	
	private String emp_gender;

	public String getEmp_fName() {
		return emp_fName;
	}

	public void setEmp_fName(String emp_fName) {
		this.emp_fName = emp_fName;
	}

	public String getEmp_lName() {
		return emp_lName;
	}

	public void setEmp_lName(String emp_lName) {
		this.emp_lName = emp_lName;
	}

	public Date getEmp_dob() {
		return emp_dob;
	}

	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmp_address() {
		return emp_address;
	}

	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_qual() {
		return emp_qual;
	}

	public void setEmp_qual(String emp_qual) {
		this.emp_qual = emp_qual;
	}

	public String getEmp_gender() {
		return emp_gender;
	}

	public void setEmp_gender(String emp_gender) {
		this.emp_gender = emp_gender;
	}
	
}
