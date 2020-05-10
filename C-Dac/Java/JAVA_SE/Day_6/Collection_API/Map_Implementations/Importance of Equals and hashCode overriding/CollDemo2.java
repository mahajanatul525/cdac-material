// hashcode and equals is not called
import java.util.*;
class Employee
{
	private String empid;
	private int deptcode;
	private int citycode;

	public Employee(String empid,int deptcode,int citycode)
	{
		this.empid=empid;
		this.deptcode=deptcode;
		this.citycode=citycode;
	}
	@Override
	public int hashCode()
	{
		System.out.println("in hashcode");
		return deptcode;
	}
	@Override
	public boolean equals(Object ref)
	{
		boolean flag=citycode==((Employee)ref).citycode;
		System.out.println("in equals\t"+flag);
		return flag;
	}
	@Override
	public String toString()
	{
		
		return empid+"\t"+deptcode+"\t"+citycode;
	}
}
public class CollDemo2
{
	public static void main(String args[])
	{
		Employee e1=new Employee("e001",1,10);
		Employee e2=new Employee("e002",1,12);
		Employee e3=new Employee("e003",2,10);
		Employee e4=new Employee("e004",1,13);

		Map<String,Employee> map=new TreeMap<String,Employee>();
		map.put("first",e1);
		map.put("second",e2);
		map.put("third",e3);
		map.put("fourth",e4);
		System.out.println(map);

System.out.println("Now Retrieving");
	Employee val=map.get("second");
		System.out.println(val);
	}
}