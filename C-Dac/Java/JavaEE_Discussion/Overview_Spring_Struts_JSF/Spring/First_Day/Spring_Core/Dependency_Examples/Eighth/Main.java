package mypack;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main 
{
	public static void main(String[] args) 
	{
		  ClassPathXmlApplicationContext mycontext=new ClassPathXmlApplicationContext("injection.xml");
		  ParentBean ic=(ParentBean) mycontext.getBean("a1");
		  ic.perform();
		  mycontext.close(); // so that “myDestroty” of both the beans should get called.
	}
}
