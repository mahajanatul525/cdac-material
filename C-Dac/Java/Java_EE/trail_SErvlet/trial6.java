import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class trial6 extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
                        PrintWriter pw=response.getWriter();
                        pw.println(request.getAttribute("book"));
                    }
}