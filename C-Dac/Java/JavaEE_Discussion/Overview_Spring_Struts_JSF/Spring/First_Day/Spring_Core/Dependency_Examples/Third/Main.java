package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
        
        ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext(new String[]{"account.xml"});
        System.out.println("Classpath loaded");
        AccountBean ab=(AccountBean)appContext.getBean("accountbean");
        ab.makeDeposit();
	}

}












