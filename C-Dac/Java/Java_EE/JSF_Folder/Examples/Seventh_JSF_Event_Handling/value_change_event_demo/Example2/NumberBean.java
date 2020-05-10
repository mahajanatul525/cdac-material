package mypack;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.*;

@ManagedBean(name="numbean")
@SessionScoped
public class NumberBean
{
	private int first,second;
	
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	UIInput total;

	public UIInput getTotal() {
		return total;
	}

	public void setTotal(UIInput total) {
		this.total = total;
	} 
 
		
} 
