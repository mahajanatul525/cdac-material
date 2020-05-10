package mypack;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
@Validations
public class FirstAction extends ActionSupport
{
	private String name;
	private int age;
	public int getAge() {
		return age;
	}
@IntRangeFieldValidator(min="18",max="58",message="Age must be between ${min} and ${max}")
	public void setAge(int age) {
		this.age = age;
	}
	
	@RequiredStringValidator(message="name must be entered")
	@StringLengthFieldValidator(type=ValidatorType.FIELD,
			message="Name should contain min of 4 characters and max 10 charcters",
			minLength="4",maxLength="10",trim=true)
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
