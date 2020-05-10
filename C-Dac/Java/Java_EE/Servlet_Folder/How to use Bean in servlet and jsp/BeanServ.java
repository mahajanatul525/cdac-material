import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import pack.*;
public class BeanServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		PrintWriter pw=response.getWriter();
		Bean1 b1=new Bean1();
		pw.println(b1.getMess());
		Bean2 b2=new Bean2();
		pw.println("<br>");
		pw.println(b2.getVal());		
		
	}
}
		

		