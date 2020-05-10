package mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		 ApplicationContext ac=new ClassPathXmlApplicationContext("context.xml");
	        CustomerDAOImpl cdi=(CustomerDAOImpl)ac.getBean("customerDAO");
	        Customer c1=new Customer();
	        c1.setCustomerId(7);
	        c1.setCustomerName("Denis Ritchie");
	        c1.setAddress("Vile Parle");
	        cdi.insertCustomer(c1);
	        System.out.println("Now Retrieving");
	        Customer ref=cdi.selectCustomer(4);
	        System.out.println("Customer is\t"+ref);
	        System.out.println("Done with SimpleJdbcTemplate");
	}
}
