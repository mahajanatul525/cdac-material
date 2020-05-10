package mypack;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController 
{
	@RequestMapping("/hello")
	public ModelAndView helloworld(HttpServletRequest request)
	{
		String message="Hello Spring MVC,Welcome to annotation";
		HttpSession session=request.getSession();
		session.setAttribute("database","mysql");
		
		ServletContext sc=request.getServletContext();
		sc.setAttribute("place","mumbai");
		return new ModelAndView("hellopage","message",message);
	}
}




