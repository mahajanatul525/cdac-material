import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServ extends HttpServlet
{
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Inside Second Servlet");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}



