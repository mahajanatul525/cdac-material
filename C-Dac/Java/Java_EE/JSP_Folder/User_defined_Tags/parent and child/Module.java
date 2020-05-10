package st1;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import javax.servlet.jsp.*;
import java.util.*;
public class Module extends SimpleTagSupport
{
	private String name;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void doTag()throws JspException,IOException
	{
		Dac parent=(Dac)getParent();
		parent.addModule(name);
	}
}
















