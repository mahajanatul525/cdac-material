package mypack;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
public class MyAction implements ServletRequestAware
{
    HttpServletRequest req;
   
   public void setServletRequest(HttpServletRequest hsr) {
        req=hsr;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    private int age;
    public String execute()
    {
        req.setAttribute("book","java");
        return "success";
    }  
}







