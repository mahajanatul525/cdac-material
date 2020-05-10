package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TourController {

	@Autowired
	TourDAO dao;
	
	@RequestMapping(value="/new_tour",method = RequestMethod.GET)
	public ModelAndView beforeadd()
	{
		Tour t=new Tour();
		return new ModelAndView("AddTour","addingtour",t);
	}
	
	@RequestMapping(value="/new_tour",method = RequestMethod.POST)
	public String actualadd(Tour tour)
	{
		dao.addTours(tour);
		return "Index";
		
	}
	
	@RequestMapping(value="/view_tour")
	public ModelAndView viewtour()
	{
		List mylist=dao.getTours();
		return new ModelAndView("ViewTour","viewlist",mylist);
	}
}
