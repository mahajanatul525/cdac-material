import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
public class URLRewritingServ1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		HttpSession s=req.getSession();
		PrintWriter out=res.getWriter();
		
		s.setAttribute("gender","male");
out.println("<html><body>");
out.println("<a href=\"" +res.encodeURL("URLRewritingServ2")+ "\">click Go to second servlet</a>");
out.println("</body></html>");
		

	}
}