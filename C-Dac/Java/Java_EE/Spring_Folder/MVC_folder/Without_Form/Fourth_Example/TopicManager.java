package mypack;

import java.util.ArrayList;
import java.util.List;

public class TopicManager 
{
	private List<String> topicList;
	private String topic;
	public TopicManager(String topic) {
		super();
		this.topic = topic;
		topicList=new ArrayList<String>();
		if(topic.equalsIgnoreCase("java"))
		{
			topicList.add("Threads");
			topicList.add("Swing");
			topicList.add("jdbc");
		}
		else if(topic.equalsIgnoreCase("dotnet"))
		{
			topicList.add("ado");
			topicList.add("delegates");
			topicList.add("webservices");
		}
	}
	public List<String> getTopicList() {
		return topicList;
	}
	
}
