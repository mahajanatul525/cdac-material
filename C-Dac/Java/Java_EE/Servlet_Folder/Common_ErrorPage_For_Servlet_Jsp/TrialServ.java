import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TrialServ extends HttpServlet
{
	public void doGet(ServletRequest request,ServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
pw.println("Trial Servlet");
int arr[]=new int[3];
arr[3]=10;
pw.println("done");
		
	}
}
		

		