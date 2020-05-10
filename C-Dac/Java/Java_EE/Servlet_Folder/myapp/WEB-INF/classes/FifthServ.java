import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*; 
public class FifthServ extends HttpServlet
{

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			ServletConfig config=getServletConfig();
			String filename=config.getInitParameter("file");
			pw.println(filename);
pw.println("<br>");

ServletContext sc=getServletContext();
String drivername=sc.getInitParameter("driver");
pw.println(drivername);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}










