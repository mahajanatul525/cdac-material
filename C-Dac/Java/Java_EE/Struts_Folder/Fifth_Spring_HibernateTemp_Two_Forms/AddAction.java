package mypack;
import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
@Validations
public class AddAction extends ActionSupport 
{
	@Autowired
	private CustomerDAO cdao;
	@Autowired
	private LoginDAO ldao;
	 
	
	private Customer customer;
	private Login login;

@Action(value="customer",results={@Result(name="success",location="/success.jsp"),@Result(name="input",location="/Customer.jsp"),@Result(name="fail",location="/Fail.jsp")})
	public String addCustomer()
	{
		if(customer!=null)
		{
			cdao.addCustomer(customer);
			return "success";
		}
		else
		{
			return "fail";
		}
	}

@Action(value="login",results={@Result(name="success",location="/success.jsp"),@Result(name="input",location="/Login.jsp"),@Result(name="fail",location="/Fail.jsp")})
	public String addLogin()
	{
		if(login!=null)
		{
			ldao.addLogin(login);
			return "success";
		}
		else
		{
			return "fail";
		}
	}
	@VisitorFieldValidator(message="")
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@VisitorFieldValidator(message="")
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		System.out.println("in set login");
		this.login = login;
	}
}
