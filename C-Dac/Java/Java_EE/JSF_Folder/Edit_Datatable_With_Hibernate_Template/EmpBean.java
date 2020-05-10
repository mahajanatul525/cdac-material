package mypack;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empbean")
public class EmpBean implements Serializable {

   private static final long serialVersionUID = 1L;
   @Autowired
   private EmpDAO empdao;
   //@Autowired
   private Emp employee;
  
/*public void setEmpdao(EmpDAO empdao) {
	this.empdao = empdao;
}*/



public void setEmployee(Emp employee) {
	this.employee = employee;
}



public void setEmployees(List<Emp> employees) {
	this.employees = employees;
}



public Emp getEmployee() {
	return employee;
}


   private  List<Emp> employees;
   


public List<Emp> getEmployees() {
	employees=empdao.getAllEmployees();
//	System.out.println("employees is\t"+employees);
	return employees;
}



public void saveEmployees()
{
	empdao.updateEmp(employee);
	employee.setCanedit(false);
}
public void editEmployee()
{
	System.out.println("employee is\t"+employee);
	employee.setCanedit(true);
}
}
