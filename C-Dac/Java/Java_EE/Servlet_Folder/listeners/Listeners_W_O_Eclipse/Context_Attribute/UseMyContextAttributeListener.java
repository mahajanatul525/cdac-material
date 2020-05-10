

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UseMyContextListener extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UseMyContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{	
		PrintWriter pw=response.getWriter();
		pw.println("Before adding attributes");
		ServletContext context=getServletContext();
		context.setAttribute("sub1", "maths");
		context.setAttribute("sub2", "english");
		pw.println("after adding attributes");
		pw.println("before removing attributes");
		context.removeAttribute("sub2");
		pw.println("after removing attributes");
		pw.println("before replacing attributes");
		context.setAttribute("sub1","computer");
		pw.println("after replacing attributes");
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}

}
