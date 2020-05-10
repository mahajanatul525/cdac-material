package mypack;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
@Validations
public class LoginAction extends ActionSupport
{
	private Login login;
	@VisitorFieldValidator(message="")
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String execute()
	{
		return "success";
	}
}
