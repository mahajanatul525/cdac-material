package mypack;


import com.opensymphony.xwork2.ActionInvocation;

import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 *
 * 
public class ActionTimer implements Interceptor

{
    
private long startTime;
   
 private long endTime;
    
public void destroy() 
{
        
System.out.println("in destroy");

    
}

    
public void init() 
    
{
        System.out.println("in init");

    
}

  
  
public String intercept(ActionInvocation next) throws Exception
    
{
      
 startTime=System.currentTimeMillis();
 
 System.out.println("Next Action name is\t"+next.getAction().getClass().getName());      
next.invoke();
       
endTime=System.currentTimeMillis();
      
 System.out.println("Action "+ next.getAction().getClass().getName() + " took "+ (endTime-startTime)+ " milisecs");
       
return "success";
    
}


}





