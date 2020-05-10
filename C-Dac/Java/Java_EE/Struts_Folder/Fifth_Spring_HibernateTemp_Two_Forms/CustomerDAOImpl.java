package mypack;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
@Component
public class CustomerDAOImpl implements CustomerDAO 
{
@Autowired
private HibernateTemplate template;
	@Override
	public void addCustomer(Customer customer) 
	{
			template.save(customer);
	}
}
