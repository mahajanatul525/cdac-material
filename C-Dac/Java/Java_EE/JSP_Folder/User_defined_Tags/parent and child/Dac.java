package st1;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import javax.servlet.jsp.*;
import java.util.*;
public class Dac extends TagSupport
{
	ArrayList<String> a;
	public void addModule(String module)
	{
		a.add(module);
		System.out.println(module);
	}
	public int doStartTag()throws JspException
	{
		System.out.println("in dac start tag");
		a=new ArrayList<String>();
		return EVAL_BODY_INCLUDE;
	}
	public int doEndTag()throws JspException
	{
		try
		{
			pageContext.getOut().println("Modules are "+a);
		}
		catch(Exception e)
		{
		}
		return EVAL_PAGE;
	}








}