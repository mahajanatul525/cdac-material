

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CustomCookieServ extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		Cookie[] cookielist=request.getCookies();
		String user=null;
		String responsestring=null;

		if(cookielist !=null)
		{
			for(int x=0;x<cookielist.length;x++)
			{
				String name=cookielist[x].getName();
				String age=cookielist[x].getValue();
				out.println(name+"     "+age);
			}
		}
		else
		{
		Cookie c=new Cookie("Sachin","100");
		c.setMaxAge(120);
			response.addCookie(c);
			responsestring=new String("Welcome to our site,  "+"we have created a session for you ");
		out.println("<html>");
		out.println("<head><title>CookieServlet</title></head>");
		out.println("<body>");
		out.println(responsestring);
		}
		out.close();
	}

}
