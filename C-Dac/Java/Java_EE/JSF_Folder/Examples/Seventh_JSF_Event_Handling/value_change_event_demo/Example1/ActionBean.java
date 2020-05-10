package mypack;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.*;

@ManagedBean(name="accbean")
@SessionScoped
public class ActionBean
{
	UIInput top; 
 
	public UIInput getTop() {
		return top;
	}

	public void setTop(UIInput top) {
		this.top = top;
	}

	String modname;

public String getModname() {
		return modname;
	}

	public void setModname(String modname) {
		this.modname = modname;
	}


 
} 
