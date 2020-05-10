package mypack;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;

public class Login 
{
	private String logname,password;
	@RequiredStringValidator(message="logname can not be blank")
	public String getLogname() {
		return logname;
	}

	public void setLogname(String logname) {
		this.logname = logname;
	}
	@RequiredStringValidator(message="password can not be blank")
	@StringLengthFieldValidator(minLength="4",maxLength="10",message="length of password must be between ${minLength} and ${maxLength}")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
