package mypack;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TopicController
{
	@RequestMapping("/topic.do")
	public ModelAndView getTopic(HttpServletRequest req)
	{
		// TODO Auto-generated method stub
		System.out.println(req.getParameter("topic"));
		TopicManager tm=new TopicManager(req.getParameter("topic"));
		ModelAndView mv=new ModelAndView("topicList");
		mv.addObject("topicList",tm.getTopicList());
		return mv;
	}

}






