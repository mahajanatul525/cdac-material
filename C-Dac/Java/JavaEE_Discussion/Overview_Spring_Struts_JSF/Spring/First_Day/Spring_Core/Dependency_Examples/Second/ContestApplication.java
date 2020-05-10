package mypack;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ContestApplication
{
	public static void main(String args[])
	{
        ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext("tech.xml");
        ContestService ref=(ContestService)appContext.getBean("contestService");
		ref.askQuestion();
	}
}


