

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstServlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		System.out.println("before adding request attributes");
		request.setAttribute("paper1","maths");
		request.setAttribute("paper2","english");
		request.setAttribute("paper3","science");
		System.out.println("after setting attributes");
		
		System.out.println("before removing request attribute");
		request.removeAttribute("paper1");
		System.out.println("after  removing request attribute");
		
		System.out.println("before replacing request attribute");
		request.setAttribute("paper2","computer");
		System.out.println("after  replacing request attribute");
		
	}
}
