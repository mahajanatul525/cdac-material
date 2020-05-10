package mypack;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class MyListener1 implements ValueChangeListener
{

	@Override
	public void processValueChange(ValueChangeEvent arg0)
			throws AbortProcessingException 
	{
		// TODO Auto-generated method stub
		System.out.println("inside  processValueChange method");
		// TODO Auto-generated method stub
		ActionBean mybean = (ActionBean) FacesContext.getCurrentInstance().
				getExternalContext().getSessionMap().get("accbean");
		
		 String val=(String) arg0.getNewValue();
		System.out.println("module entered is\t"+val);
		if(val.equalsIgnoreCase("java"))
		{
			mybean.getTop().setValue("threading");
		}
		else if(val.equalsIgnoreCase("c++"))
		{
			mybean.getTop().setValue("templates");
		}
		else if(val.equalsIgnoreCase("database"))
		{
			mybean.getTop().setValue("triggers");
		}
		else
		{
			mybean.getTop().setValue("Not Applicable");
		}
		
		
	}
		
}
