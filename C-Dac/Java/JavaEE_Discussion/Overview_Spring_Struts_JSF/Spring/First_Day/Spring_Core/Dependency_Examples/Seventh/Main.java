package mypack;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext mycontext=new ClassPathXmlApplicationContext("injection.xml");
	    ParentBean ic=(ParentBean)mycontext.getBean("a1");
	    ic.perform();
	    System.out.println("Done");
	    mycontext.close();  // here “myDestroy()” will be called.
// You need to explicitly close the ApplicationContext, otherwise Spring won't know that everything is shutting down.
	}
}










