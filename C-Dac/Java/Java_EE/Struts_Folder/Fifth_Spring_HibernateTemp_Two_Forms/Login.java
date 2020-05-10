package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.FieldExpressionValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
@Entity
@Table(name="login")
public class Login
{
	
	private String confirmpass;
	@Transient
@FieldExpressionValidator(expression ="(confirmpass == password)", fieldName = "confirmpass", message = "Passwords must match")
public String getConfirmpass() {
		return confirmpass;
	}
	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}
private int id;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String logname;
private String password;

@Column(name="logname")
public String getLogname() 
{
	return logname;
}
@RequiredStringValidator(type=ValidatorType.FIELD,
key="errors.required")
public void setLogname(String logname) 
{
	this.logname = logname;
}
@Column(name="password")
public String getPassword() 
{
	return password;
}
@Override
public String toString() {
	return "Login [logname=" + logname + ", password=" + password + "]";
}
@RequiredStringValidator(type=ValidatorType.FIELD,
key="errors.required")
@StringLengthFieldValidator(type=ValidatorType.FIELD,
message="Password should contain min of 7 characters and max 15 charcters",
minLength="7",maxLength="15",trim=true)
public void setPassword(String password) 
{
	this.password = password;
}
}









