package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeWorldController 
{
	@RequestMapping("/welcome")
	public ModelAndView helloworld()
	{
		String message="Welcome Spring MVC";
		return new ModelAndView("wishpage","message",message);
	}
}










