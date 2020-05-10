

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet5
 */
@WebServlet("/servlet5")
public class servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
	  		//String productName =(String)i.next();	
	  		pw.println(i.next());
	  	}
	  	   }
	  	catch(Exception e)
		{
			e.printStackTrace();
		}
	  		   
	  
		}

	}

