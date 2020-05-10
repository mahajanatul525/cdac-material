package mypack;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Customer 
{
	private String name;
	@RequiredStringValidator(message="name can not be blank")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
