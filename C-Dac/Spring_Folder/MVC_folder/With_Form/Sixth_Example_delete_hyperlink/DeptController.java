package mypack;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/dept")
public class DeptController 
{
	@Autowired
	DeptDAO sdao;
	@RequestMapping(value="/dept_show",method = RequestMethod.GET)
	public ModelAndView display()
	{
		List mylist=sdao.getAllDept();
		return new ModelAndView("DeptView","mlist",mylist);
	}
	@RequestMapping(value="/dept_del",method = RequestMethod.GET)
	public String remove(HttpServletRequest request)
	{
		int deptno=Integer.parseInt(request.getParameter("id"));
		System.out.println("deptno is\t"+deptno);
		sdao.delete(deptno);
		return "redirect:/dept_show.do";
	}
}











