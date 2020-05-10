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
		List<String> subtopiclist=null;
		MyBean mybean = (MyBean) FacesContext.getCurrentInstance().
				getExternalContext().getSessionMap().get("mybean");
		// TODO Auto-generated method stub
		System.out.println("inside  processValueChange method");
		System.out.println("Value Selected is\t"+arg0.getNewValue());
		
		if(arg0.getComponent().getId().equalsIgnoreCase("a1"))
		{
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
		else if(arg0.getComponent().getId().equalsIgnoreCase("a2"))
		{
			String topic=(String) arg0.getNewValue();
		if(topic.equalsIgnoreCase("threading"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("synchronization");
			subtopiclist.add("wait");
			subtopiclist.add("notify");
		}
		else if(topic.equalsIgnoreCase("generics"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("collection");
			subtopiclist.add("buckets");
			subtopiclist.add("performance");
		}
		else if(topic.equalsIgnoreCase("exception"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("ARM");
			subtopiclist.add("try");
			subtopiclist.add("catch");
		}
		else if(topic.equalsIgnoreCase("template"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("classtemplate");
			subtopiclist.add("functiontemplate");
			subtopiclist.add("overloadtemplate");
		}
		else if(topic.equalsIgnoreCase("polymorphism"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("virtualfun");
			subtopiclist.add("virtualtabl");
			subtopiclist.add("virtualptr");
		}
		else if(topic.equalsIgnoreCase("friendfunction"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("friendclass");
			subtopiclist.add("conversion");
			subtopiclist.add("overloading");
		}
		else if(topic.equalsIgnoreCase("triggers"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("triggers1");
			subtopiclist.add("triggers2");
			subtopiclist.add("triggers3");
		}
		else if(topic.equalsIgnoreCase("queries"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("queries1");
			subtopiclist.add("queries2");
			subtopiclist.add("queries3");
		}
		else if(topic.equalsIgnoreCase("dba"))
		{
			subtopiclist=new ArrayList<String>();
			subtopiclist.add("dba1");
			subtopiclist.add("dba2");
			subtopiclist.add("dba3");
		}
		System.out.println("subtopiclist is\t"+subtopiclist);
		mybean.setSubtopicnames(subtopiclist);
		}
			
			
		}

}
