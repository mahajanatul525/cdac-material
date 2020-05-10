package mypack;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

public class MyListener1 implements ValueChangeListener
{
	int val2;

	@Override
	public void processValueChange(ValueChangeEvent arg0)
			throws AbortProcessingException 
	{
		// TODO Auto-generated method stub
		System.out.println("inside  processValueChange method");
		// TODO Auto-generated method stub
		NumberBean mybean = (NumberBean) FacesContext.getCurrentInstance().
				getExternalContext().getSessionMap().get("numbean");
		
		if(arg0.getComponent().getId().equalsIgnoreCase("a2"))
		{
			val2=(int) arg0.getNewValue();
		
			System.out.println("val2 is\t"+val2);
			
			System.out.println("first is\t"+mybean.getFirst());
			System.out.println("second is\t"+mybean.getSecond());
			mybean.getTotal().setValue(mybean.getFirst()+val2);
			
		}
		
	}
		
}
