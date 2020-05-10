import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SessionServ1 extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			pw.println("creating a session");
			HttpSession session=request.getSession();
			session.setAttribute("book","CompleteReference");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}



