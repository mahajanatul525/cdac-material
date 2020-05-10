package mypack;
public class EmployeeBO 
{
	public void setEmployeedao(EmployeeDAO employeedao) {
		this.employeedao = employeedao;
	}
	EmployeeDAO employeedao;
	void add(Employee emp)
	{
		employeedao.insertEmployee(emp);
	}
	Employee get()
	{
		return employeedao.getEmployee();
	}
}
