package mypack;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean(name="navigationController",eager=true)
@RequestScoped
public class NavigationController
{  
	
	@ManagedProperty(value="#{param.pageid}")
	   private String pageid;

	   
   public String showPage()
   {
	   
      if(pageid.equals("1"))
      {
         return "java8";
      }
      else if(pageid.equals("2"))
      {
         return "c++";
      }
      else if(pageid.equals("3"))
      {
         return "database";
      }
      else
      {
         return "home";
      }
   }

public void setPageid(String pageid) {
	System.out.println("Inside setpageid\t"+pageid);
	this.pageid = pageid;
}








}