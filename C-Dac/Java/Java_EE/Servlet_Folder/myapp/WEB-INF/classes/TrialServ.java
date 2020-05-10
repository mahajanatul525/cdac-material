import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TrialServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
pw.println("Trial Servlet");


String s=null;
pw.println(s.length());
pw.println("done");
		
	}
}
		

		