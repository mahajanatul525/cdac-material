package mypack;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;
public class LogBeforeCall implements MethodBeforeAdvice
{
    public void before(Method method, Object[] os, Object o) throws Throwable
    {
        System.out.println("Before Calling the Method");
    }
}

/*
Parameters:
    method - method being invoked
    os - arguments to the method
    o - target of the method invocation. May be null. 

*/