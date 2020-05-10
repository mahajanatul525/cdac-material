package mypack;

import java.io.Serializable;
public class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int id;
	private String name,desig;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desig=" + desig
				+ "]";
	}
	
}
