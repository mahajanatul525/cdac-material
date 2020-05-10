package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String afterSubmit(Student student)
	{
		sdao.add(student);
		return "success";
	}
}











