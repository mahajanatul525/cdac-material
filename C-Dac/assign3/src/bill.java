

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class bill
 */
@WebServlet("/bill")
public class bill extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
	  	   {
			HttpSession session=request.getSession(false);
			ArrayList a6= (ArrayList)session.getAttribute("key1");

			Iterator i = a6.iterator();
			while(i.hasNext()){
				PrintWriter pw = response.getWriter();
				pw.println("in bill");
				pw.println(i.next()+"<br/>");
	  			}
	  	 
	  	   }
	  	catch(Exception e)
		{
			e.printStackTrace();
		}
	  		   
	
	}

}
