package mypack;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emplbeanaction")
public class EmplBeanAction
{
	private  List<Empl> employees;
	/**
	 * @return the employees
	 */
	public List<Empl> getEmployees() {
		employees=empdao.getAllEmployees();
		
		return employees;
	}


	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Empl> employees) {
		this.employees = employees;
	}


	//private static final long serialVersionUID = 1L;
	public EmplBeanAction()
	{
		System.out.println("inside Emplbeanaction constr");
	}
	

	@Autowired(required=true)
	EmplDAO empdao;

	@Autowired
	private Empl employee;
	
	



	/**
	 * @return the employee
	 */
	public Empl getEmployee() {
		return employee;
	}


	public void addEmp()
	{
		System.out.println("inside addEmp");
		empdao.saveEmployee(employee);
       
	}
}
