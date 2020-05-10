

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MyServ
 */
@WebServlet("/MyServ")
public class MyServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Before creating session");
		HttpSession session=request.getSession();
		session.setAttribute("database","Oracle");
		session.setAttribute("technology","java");
		PrintWriter pw=response.getWriter();
		pw.println(session.getAttribute("database"));
		pw.println(session.getAttribute("technology"));
		System.out.println("session accessed");
		System.out.println("Before replacing attribute");
		session.setAttribute("database","MySql");
		System.out.println("After replacing attribute");
		System.out.println("Before removing attribute");
		session.removeAttribute("technology");
		System.out.println("Before invalidating session");
		session.invalidate();
		System.out.println("After invalidating session");
	}

}
