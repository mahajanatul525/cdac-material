package mypack;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
@Validations
public class CustomerAction extends ActionSupport implements ServletRequestAware
{
	private Customer customer;
	HttpServletRequest request;
	@VisitorFieldValidator(message="")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String execute()
	{
		request.setAttribute("name",customer.getName());
		return "success";
	}
	@Override
	public void setServletRequest(HttpServletRequest arg0) 
	{
		request=arg0;
	}
}










