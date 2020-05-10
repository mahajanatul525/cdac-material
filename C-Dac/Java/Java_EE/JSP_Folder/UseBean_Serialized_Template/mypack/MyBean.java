package mypack;
import java.io.*;
public class MyBean implements Serializable
{
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
}