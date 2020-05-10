package mypack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import 

org.springframework.web.bind.annotation.InitBinder;
import 

org.springframework.web.bind.annotation.ModelAttribute;
import 

org.springframework.web.bind.annotation.RequestMapping;
import 

org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/new_book")
public class BookNewController
{
	List <String>publisherlist;
	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(
		@ModelAttribute("mybook") Book book)
		{
			//return form success view
		return "bookList";
 
	}

	@ModelAttribute("publisherList")
	public List<String> populateWebFrameworkList() 
	{
 	publisherlist=new ArrayList<String>();
	publisherlist.add("SPD");
	publisherlist.add("BPB");
	return publisherlist;
	}
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView before()
	{
		Book defaultBook=new Book();
		defaultBook.setBookName("Enter New Book's Name");
		defaultBook.setPrice(0);
		return new ModelAndView("bookNew","mybook",defaultBook);
	}

}











