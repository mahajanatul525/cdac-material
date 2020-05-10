import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServ2 extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("Retrieving a session");
			HttpSession session=request.getSession(false);
		if(session!=null)
		{
		pw.println(session.getAttribute("book"));
		}
		else
		{
		pw.println("session does not exists");
		}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}



