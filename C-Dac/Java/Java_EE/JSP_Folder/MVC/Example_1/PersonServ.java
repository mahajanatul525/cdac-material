import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.Address;
import mypack.Person;

/**
 * Servlet implementation class PersonServ
 */
@WebServlet("/PersonServ")
public class PersonServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PersonServ() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.setName("Abc");
		p1.setAge(26);
		Address a1 = new Address();
		a1.setCity("pune");
		a1.setCountry("India");
		a1.setPostcode("AA444");
		a1.setPhoneNumber("9765432981");
		p1.setAddress(a1);
		
		Person p2 = new Person();
		p2.setName("Xyz");
		p2.setAge(29);
		Address a2 = new Address();
		a2.setCity("mumbai");
		a2.setCountry("India");
		a2.setPostcode("MM444");
		a2.setPhoneNumber("9862159654");
		p2.setAddress(a2);
		List<Person> personlist=new ArrayList<Person>();
		personlist.add(p1);
		personlist.add(p2);
		request.setAttribute("mylist", personlist);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/list.jsp");
		rd.forward(request, response);
	}

}
