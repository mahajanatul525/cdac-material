package mypack;
import mypack.WelcomeMessage;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        BeanFactory bf=new ClassPathXmlApplicationContext("cname.xml");
        WelcomeMessage wm=(WelcomeMessage)bf.getBean("a1");
        System.out.println(wm.getMessage());
    }
}

