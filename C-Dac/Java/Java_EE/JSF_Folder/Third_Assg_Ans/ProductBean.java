package mypack;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "product")
@SessionScoped
public class ProductBean
{
	private String name;
	private List<String>mylist=new ArrayList<String>();
	public List<String> getMylist() {
		return mylist;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		mylist.add(this.name);
	}
 
}