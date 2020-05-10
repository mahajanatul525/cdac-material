import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class trial5 extends HttpServlet
{
	public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
                        PrintWriter pw=response.getWriter();
                         request.setAttribute("book","java");
                         pw.println("trial5 done");
                       response.sendRedirect("trial6");
}
}
