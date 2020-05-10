package mypack;


import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class PersonDAOImpl implements PersonDAO 
{
	@Autowired
	private HibernateTemplate template;

  	@Override
	public void save(Person ref) {
		// TODO Auto-generated method stub
		template.save(ref);
	
	}

}











