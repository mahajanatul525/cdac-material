package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController 
{
	@RequestMapping("/hello")
	public ModelAndView helloworld()
	{
		String message="Hello Spring MVC";
		return new ModelAndView("wishpage","message",message);
	}
}










