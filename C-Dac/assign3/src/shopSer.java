

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class shopSer
 */
@WebServlet("/shopSer")
public class shopSer extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		 try
	  	   {
				 PrintWriter pw = response.getWriter();
	  	    	 ArrayList a=(ArrayList)request.getAttribute("key");
	  	Iterator i=a.iterator();
	  	  	while(i.hasNext()){
	  		String productName =(String)i.next();	
	  		pw.println("<form action='Secondserv' method='get'>");
	  	  	pw.println(productName+"<input type='checkbox' name='ch[]' value='"+productName+"'/>"+"<br/>");
	  			}
	  	  pw.println("<input type= submit name='addToCart' value='Add To Cart'/></form>");
	  	   }
	  	catch(Exception e)
		{
			e.printStackTrace();
		}
	  		   
	
	}

}
