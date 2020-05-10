import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class FourthServ extends HttpServlet
{
	Connection con;

	@Override
	public void init()
	{
		try
		{
Class.forName("com.mysql.jdbc.Driver");
String ss="jdbc:mysql://localhost:3306/mydb";
		 con=DriverManager.getConnection(ss,"root","root");
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
	@Override
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
	String name=request.getParameter("name");
	int rollno=Integer.parseInt(request.getParameter("rollno").trim());
PreparedStatement pst=con.prepareStatement("insert into student values(?,?)");
pst.setInt(1,rollno);
pst.setString(2,name);
int k=pst.executeUpdate();
if(k>0)
{
	pw.println("record added");
}
else
{
	pw.println("record not added");
}	

		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}










