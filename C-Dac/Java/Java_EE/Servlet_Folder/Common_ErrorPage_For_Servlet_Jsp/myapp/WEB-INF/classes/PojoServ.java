import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import pack1.*;
import pack2.*;
public class PojoServ extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			Sample1 s1=new Sample1();
			pw.println(s1.disp1());
			Sample2 s2=new Sample2();
			pw.println(s2.disp2());
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}










