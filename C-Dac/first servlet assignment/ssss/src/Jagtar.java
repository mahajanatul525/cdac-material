import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jagtar
 */
@WebServlet("/Jagtar")
public class Jagtar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			String name=request.getParameter("eer");
			response.setContentType("text/html");
			if(name.equals("volvo"))
			{	
				RequestDispatcher rd=request.getRequestDispatcher("Forwarded");
				rd.forward(request,response);			
			}
			if(name.equals("saab"))
			{	
				RequestDispatcher rd=request.getRequestDispatcher("ForwardedCppp");
				rd.forward(request,response);			
			}
			if(name.equals("mercedes"))
			{	
				RequestDispatcher rd=request.getRequestDispatcher("oracle");
				rd.forward(request,response);			
			}
			
		}
		catch(Exception ee)
		{
			System.out.println("in catch     "+ee);
		}
	}

	
	}


