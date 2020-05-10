package mypack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Sachin");
		e1.setDesig("officer");
	    BeanFactory bf=new ClassPathXmlApplicationContext("inject.xml");
	    EmployeeBO empbo=(EmployeeBO)bf.getBean("employeebo");
	    empbo.add(e1);
	    System.out.println(empbo.get());
	    System.out.println("Done with Employee");

	}

}






