import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ForwardedServ extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("In ForwardedServlet");
		}
		catch(Exception ee)
		{
			System.out.println("in forwarding"+ee);
		}
	}
}