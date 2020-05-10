

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet4
 */
@WebServlet("/servlet4")
public class servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String ss="jdbc:mysql://localhost:3306/angela";
			Connection con=DriverManager.getConnection(ss,"root","root");
			PreparedStatement pst = con.prepareStatement("select firstname from myguests");
			ResultSet rst=pst.executeQuery();
			ArrayList<String> a = new ArrayList<String>();
			//Iterator i = a.iterator();
			while(rst.next()){
				String nam=rst.getString("firstname");
				a.add(nam);

			}
			request.setAttribute("key", a);
			RequestDispatcher rd = request.getRequestDispatcher("servlet5");
			rd.forward(request, response);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	}


