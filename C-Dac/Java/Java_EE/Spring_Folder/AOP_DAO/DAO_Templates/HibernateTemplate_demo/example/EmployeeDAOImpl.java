package mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAOImpl implements EmployeeDAO 
{
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) 
	{  
		    this.template= template;  
	}  

	@Override
	public void saveEmployee(Employee ref) 
	{
		template.save(ref);
	}

	@Override
	public void updateEmployee(Employee ref)
	{
		template.update(ref);
	}

	@Override
	public void deleteEmployee(Employee ref) 
	{
		template.delete(ref);
	}

	@Override
	public Employee getById(int id) 
	{
		Employee ob=(Employee)template.get(Employee.class,id);
		return ob;
	}

	@Override
	public List<Employee> getEmployees() 
	{
		List<Employee> list=new ArrayList<Employee>();  
		list=template.find("from Employee e");
	//	list=template.loadAll(Employee.class);  
		return list;  

	}
}




