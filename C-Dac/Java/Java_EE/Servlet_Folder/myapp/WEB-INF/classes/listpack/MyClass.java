package listpack;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;




public class MyClass implements HttpSessionBindingListener {

    /**
     * Default constructor. 
     */
    public MyClass() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("value bound");
			
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0) {
        // TODO Auto-generated method stub
    	System.out.println("value unbound");
		
    }
	
}
