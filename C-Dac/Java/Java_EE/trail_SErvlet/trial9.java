import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class trial9 extends HttpServlet
{

	@Override
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
                     PrintWriter pw=response.getWriter();
                     ServletContext context=getServletContext();
	context.setAttribute("database","oracle");
pw.println("trial9 done");
}
}
     