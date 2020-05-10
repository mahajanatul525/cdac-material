package mypack;

import java.util.ArrayList;
import java.util.List;

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
		List<String> topiclist=null;
		
		MyBean mybean = (MyBean) FacesContext.getCurrentInstance().
				getExternalContext().getSessionMap().get("mybean");
		// TODO Auto-generated method stub
		System.out.println("inside  processValueChange method");
		System.out.println("Value Selected is\t"+arg0.getNewValue());
		String module=(String) arg0.getNewValue();
		if(module.equalsIgnoreCase("java"))
		{
			topiclist=new ArrayList<String>();
			topiclist.add("threading");
			topiclist.add("exception");
			topiclist.add("generics");
		}
		else if(module.equalsIgnoreCase("c++"))
		{
			topiclist=new ArrayList<String>();
			topiclist.add("template");
			topiclist.add("polymorphism");
			topiclist.add("friendfunction");
		}
		else
		{
			topiclist=new ArrayList<String>();
			topiclist.add("triggers");
			topiclist.add("queries");
			topiclist.add("dba");
		}
	
		System.out.println("topiclist is\t"+topiclist);
		mybean.setTopicnames(topiclist);
			
		}

}
