import java.io.*;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConPoolServ extends HttpServlet
{
	Connection con;
	public void init()
	{
		try
		{
		InitialContext ic = new InitialContext();
	Context envContext  = (Context)ic.lookup("java:/comp/env");
	DataSource ds = (DataSource) envContext.lookup("mypool");
	con=ds.getConnection();
		}
		catch(Exception ee)
		{
			System.out.println("In init\t"+ee);
		}
	}
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			PrintWriter out=response.getWriter();
	PreparedStatement pst=con.prepareStatement("select * from dept");
	ResultSet rs=pst.executeQuery();
	while(rs.next())
	{
		out.println(rs.getInt(1)+"\t");
		out.println(rs.getString(2)+"\t");		
		out.println(rs.getString(3));
	}
		}
		catch(Exception ex)
		{
			System.out.println("In Service\t"+ex);
		}
	}
}