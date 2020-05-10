package mypack;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/new_student")
public class StudentController 
{
	@Autowired
	StudentDAO sdao;
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Student s=new Student();
		return new ModelAndView("stud","mystudent",s);
	}
	@RequestMapping(method = RequestMethod.POST)
	public String afterSubmit(@Valid @ModelAttribute("mystudent")Student student,BindingResult result)
	{
		if(result.hasFieldErrors())
		{
			return "stud";
		}
		sdao.add(student);
		return "success";
	}
}








