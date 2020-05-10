package mypack;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class MyListener implements ActionListener
{

	@Override
	public void processAction(ActionEvent arg0) throws AbortProcessingException 
	{
		System.out.println("inside processAction method");
		// TODO Auto-generated method stub
		ActionBean mybean = (ActionBean) FacesContext.getCurrentInstance().
				getExternalContext().getSessionMap().get("accbean");
		
		
		String str=mybean.getButtonText();
			
		if(str.equals("Disable"))
	    {
	      mybean.setButtonText("Enable");
	     
	    }
	    else
	    {
	    	 mybean.setButtonText("Disable");
	      
	    }
	}
		
}
