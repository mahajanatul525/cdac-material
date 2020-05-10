package mypack;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

   private static final long serialVersionUID = 1L;
   private String name,dept;
   private int age;
   private double salary;

   private  List<Employee> employees;
   
   public UserData()
   {
      employees = new LinkedList<Employee>();
      employees.add(new Employee("aaa","acc",23,20000));
      employees.add(new Employee("bbb","mkt",22,23000));
      employees.add(new Employee("ccc","trg",25,28000));
      employees.add(new Employee("ddd","acc",24,22000));
   }
public  List<Employee> getEmployees() {
	return employees;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}
public void addEmployee()
{
	employees.add(new Employee(getName(),getDept(),getAge(),getSalary()));
}

}
