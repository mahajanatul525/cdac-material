

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Secondserv
 */
@WebServlet("/Secondserv")
public class Secondserv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   try
    	   {
    		   ArrayList<String> a5 = new ArrayList<String>();
    		   String s[]=request.getParameterValues("ch[]");
    		 PrintWriter pw=response.getWriter();
    		 pw.println("item added inside cart");
    		 for (int i=0; i<s.length; i++){
    		 //pw.println(s[i]+"<br/>");
    		 a5.add(s[i]);
    		 pw.println(s[i]+"<br/>");
    		 }
    		 HttpSession session = request.getSession();
    		 session.setAttribute("key1", a5);
    		 RequestDispatcher rd1= request.getRequestDispatcher("bill");
    		 rd1.include(request,response);
    		
    		}
    	   catch(Exception e)
    	   {
    		   
    	   }
       }
	}


