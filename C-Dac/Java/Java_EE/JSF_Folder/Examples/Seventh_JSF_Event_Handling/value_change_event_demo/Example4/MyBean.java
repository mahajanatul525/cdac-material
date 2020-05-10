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
	private String module;
	private String topic;
	private String subtopic;
	
	public String getSubtopic() {
		return subtopic;
	}



	public void setSubtopic(String subtopic) {
		this.subtopic = subtopic;
	}



	public String getModule() {
		return module;
	}



	public void setModule(String module) {
		this.module = module;
	}



	public String getTopic() {
		return topic;
	}



	public void setTopic(String topic) {
		this.topic = topic;
	}



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


private List<String> subtopicnames;

	public List<String> getSubtopicnames() {
	return subtopicnames;
}



public void setSubtopicnames(List<String> subtopicnames) {
	this.subtopicnames = subtopicnames;
}



	public List<String> getTopicnames() {
	return topicnames;
}



public void setTopicnames(List<String> topicnames) {
	this.topicnames = topicnames;
}

public void execute()
{
	System.out.println("selected module is\t"+module);
	System.out.println("selected topic is\t"+topic);
	System.out.println("selected subtopic is\t"+subtopic);
}
	
	
 
		
} 
