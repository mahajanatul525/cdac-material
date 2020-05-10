package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("persondaoimpl")
public class PersonDAOImpl implements PersonDAO 
{
	public PersonDAOImpl()
	{
		System.out.println("inside Persondaoimpl constr");
	}
	@Autowired
	HibernateTemplate template;
	

	@Override
	public void savePerson(Person ref) 
	{
		template.save(ref);
	}
}
