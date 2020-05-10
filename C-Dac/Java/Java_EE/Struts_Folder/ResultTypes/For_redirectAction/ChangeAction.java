package mypack;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

public class ChangeAction implements ServletRequestAware
{
    public void setServletRequest(HttpServletRequest hsr)
    {
        req=hsr;
    }
    HttpServletRequest req;
    public String execute()
    {
        String str=(String)req.getAttribute("book");
        str+=" reference";
        req.setAttribute("book", str);
        return "success";
    }
	
}
