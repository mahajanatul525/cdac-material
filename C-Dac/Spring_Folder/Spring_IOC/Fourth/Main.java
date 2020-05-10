package mypack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		BeanFactory appContext=new ClassPathXmlApplicationContext("inject.xml");
		System.out.println("After BeanFactory");
		InjectReference ic=(InjectReference)appContext.getBean("a1");
		ic.perform();

	}

}


