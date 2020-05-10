package mypack;
import com.opensymphony.xwork2.ActionSupport;
public class FirstAction extends ActionSupport
{
	private String name;
	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String execute()
	{
		return "success";
	}
}
