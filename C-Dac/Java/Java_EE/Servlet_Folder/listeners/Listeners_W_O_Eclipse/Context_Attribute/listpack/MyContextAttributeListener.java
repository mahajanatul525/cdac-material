package listpack;

import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyContextAttributeListener implements ServletContextAttributeListener {

   

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("attribute added\n");

    	
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("attribute removed");
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("attribute replaced\t");
    }
	
}
