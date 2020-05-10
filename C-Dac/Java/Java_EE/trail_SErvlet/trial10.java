import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class trial10 extends HttpServlet
{

	@Override
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
                     PrintWriter pw=response.getWriter();
                     ServletContext context=getServletContext();
	pw.println(context.getAttribute("database"));
pw.println("trial10 done");
}
}