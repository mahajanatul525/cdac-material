package mypack;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookListController 
{
	@RequestMapping("/list_book")
	public ModelAndView getList()
	{
		ModelAndView modelAndView=new ModelAndView("bookList");
		modelAndView.addObject("mylist",BookManager.getBookList());
		return modelAndView;
	}
}











