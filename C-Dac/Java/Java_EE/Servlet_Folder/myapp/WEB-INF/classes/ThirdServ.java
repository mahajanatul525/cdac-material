import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ThirdServ extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
	String name=request.getParameter("name");
	int rollno=Integer.parseInt(request.getParameter("rollno").trim());	
			pw.println(name+"    "+rollno);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}








