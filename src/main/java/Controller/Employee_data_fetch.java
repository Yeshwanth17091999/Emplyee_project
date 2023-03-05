package Controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import DAO.Employee_access_obj;
import DTO.Employee;

@WebServlet("/save")
public class Employee_data_fetch extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Employee em  = new Employee();
		em.setEmp_fName(req.getParameter("Emp_fname"));
		
		em.setEmp_lName( req.getParameter("Emp_lname"));
		
		
		
		em.setEmp_dob(Date.valueOf(req.getParameter("DOB")));
		
		em.setPassword(req.getParameter("psw"));
		
		em.setEmp_address(req.getParameter("address"));
		
		em.setEmp_email(req.getParameter("email"));
		em.setEmp_qual(req.getParameter("qual"));
		em.setEmp_gender(req.getParameter("gen"));
		
		Employee_access_obj eao = new Employee_access_obj();
		
		eao.persist(em);
		
	}

}
