package mypack;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.*;

@ManagedBean(name="mybean")
@SessionScoped
public class MyBean
{
	private List<String> modulenames;
	
	public MyBean()
	{
		modulenames=new ArrayList<String>();
		modulenames.add("c++");
		modulenames.add("java");
		modulenames.add("database");
	}
	
	

	public List<String> getModulenames() {
		return modulenames;
	}

	public void setModulenames(List<String> modulenames) {
		this.modulenames = modulenames;
	}


private List<String> topicnames;




	public List<String> getTopicnames() {
	return topicnames;
}



public void setTopicnames(List<String> topicnames) {
	this.topicnames = topicnames;
}


	
} 
