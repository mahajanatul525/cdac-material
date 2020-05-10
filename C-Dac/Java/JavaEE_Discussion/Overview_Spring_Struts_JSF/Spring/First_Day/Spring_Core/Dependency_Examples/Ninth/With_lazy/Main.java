import mypack.MyClass;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        BeanFactory bf=new ClassPathXmlApplicationContext("lazy.xml");
        System.out.println("After Context");
        MyClass ob=(MyClass)bf.getBean("a1");
        System.out.println("After getBean");
        ob.disp();
    }
}
