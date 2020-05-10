package mypack;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;


@Validations
@Action(value="go",results={@Result(name="success",location="/success.jsp"),@Result(name="input",location="/first.jsp")})
public class FirstAction extends ActionSupport
{
	private Person person;
	@Autowired
	private PersonDAO persondao;
	
	@VisitorFieldValidator(message="")
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String execute()
	{
		persondao.save(person);
		return "success";
	}
}










