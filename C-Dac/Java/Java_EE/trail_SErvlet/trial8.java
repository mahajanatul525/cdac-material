import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class trial8 extends HttpServlet
{
	@Override
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("creating a session");
			HttpSession session=request.getSession(false);
			pw.println(session.getAttribute("course"));
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}