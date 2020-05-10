package mypack;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	private HibernateTemplate template;
	public List get()
	{
		List ar=null;
		System.out.println("inside get method");
		try
		{
	
		ar=template.find("from Product");
		
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
				System.out.println("ar is\t"+ar);
		return ar;
	}	
}






