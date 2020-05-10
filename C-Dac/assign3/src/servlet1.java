

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet1
 */
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String ss="jdbc:mysql://localhost:3306/library";
			Connection con=DriverManager.getConnection(ss,"root","root");
			PreparedStatement pst = con.prepareStatement("select name from book");
			ResultSet rst=pst.executeQuery();
			ArrayList<String> a = new ArrayList<String>();
			//Iterator i = a.iterator();
			while(rst.next()){
				String nam=rst.getString("name");
				a.add(nam);

			}
			request.setAttribute("key",a);
			RequestDispatcher rd = request.getRequestDispatcher("shopSer");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}


