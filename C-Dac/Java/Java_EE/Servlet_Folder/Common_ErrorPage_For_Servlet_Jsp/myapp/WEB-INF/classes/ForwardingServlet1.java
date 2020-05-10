

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ForwardingServlet1 extends HttpServlet {
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		ServletContext context=getServletContext();
		
		ServletContext context1=context.getContext("/RDD");
		RequestDispatcher rd=context1.getRequestDispatcher("/FirstServ"); 
		rd.forward(request, response); 
		
	}

}










