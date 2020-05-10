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
	        c1.setCustomerId(6);
	        c1.setCustomerName("Kanitkar");
	        c1.setAddress("Nagpur");
	        cdi.insertCustomer(c1);
	        System.out.println("Now Retrieving");
	        Customer ref=cdi.selectCustomer(2);
	        System.out.println("Customer is\t"+ref);
	        System.out.println("Done with NamedParameterJdbcTemplate");
	}
}
