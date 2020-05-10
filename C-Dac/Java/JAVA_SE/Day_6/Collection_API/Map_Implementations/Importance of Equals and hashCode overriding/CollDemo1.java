// this program is about hash collision
// when u call get or put, the sequence is "hashCode()","==" 
// if == returns false , it checks "equals"
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
		System.out.println("in hashcode\t"+deptcode);
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
public class CollDemo1
{
	public static void main(String args[])
	{
		Employee e1=new Employee("e001",1,10);
		Employee e2=new Employee("e002",1,12);
		Employee e3=new Employee("e003",2,10);
		Employee e4=new Employee("e004",1,13);
		Employee e5=e1;

		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(e1,"first");
		map.put(e2,"second");
		map.put(e3,"third");
		map.put(e4,"fourth");
		map.put(e5,"fifth");  /* hashcode is called, == compared with first entry (e004).not true,so equals is checked , it gives false
== compared with second entry (e002).not true,so equals is checked , it gives false
== compared with third entry (e001).it is true,so no need to check equals and hence it is discarded.
*/
		System.out.println(map);
/*
if HashMap stores above entries as
{e004   1       13=fourth, e002 1       12=second, e001 1       10=first, 
e003    2       10=third}
then output will be as follows based on how get method is called
*/
	//String val=map.get(e2); //in hashcode ,in equals  false , second
		/*String val=map.get(e1); in hashcode, in equals  false
in equals       false first*/
		//String val=map.get(e4); // in hashcode  fourth //av		
//String val=map.get(e3);  // in hashcode  third
		//System.out.println(val);
	}
}