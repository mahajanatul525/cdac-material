package st1;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import java.io.*;
import javax.servlet.jsp.*;
public class TagCode2 extends SimpleTagSupport
{
	public void doTag()throws JspException,IOException
	{
		JspFragment fragment=getJspBody();
		if(fragment==null)
		{
			getJspContext().getOut().write("<b>You can have body for this tag</b>");
		}
		else
		{
			fragment.invoke(null);
		}
	}
}