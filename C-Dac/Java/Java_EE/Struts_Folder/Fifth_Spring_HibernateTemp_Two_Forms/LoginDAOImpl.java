package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
@Component
public class LoginDAOImpl implements LoginDAO 
{
	@Autowired 
	private HibernateTemplate template;

	@Override
	public void addLogin(Login login) 
	{
		template.save(login);
	}
}
