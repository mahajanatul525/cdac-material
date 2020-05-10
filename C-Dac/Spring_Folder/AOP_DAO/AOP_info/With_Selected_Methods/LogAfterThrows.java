package mypack;
import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;
public class LogAfterThrows implements ThrowsAdvice 
{
	 public void afterThrowing(Method method,Object[] args,Object target,Exception exception)
	    {
	        System.out.println("Exception is thrown on method\t"+method.getName());
	    }

}
